package lesson31;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestClassesDate {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMM-dd !! hh:mm");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MM/yy");

    void smena(LocalDateTime localDateTime1, LocalDateTime localDateTime2,
               Period p, Duration d) {
        System.out.println();
        while (localDateTime1.isBefore(localDateTime2)) {
            System.out.print("Work with: " + localDateTime1.format(formatter1) + " | ");
            localDateTime1 = localDateTime1.plus(p);
            System.out.println("Before: " + localDateTime1.format(formatter1));
            System.out.print("Relax with: " + localDateTime1.format(formatter2) + " | ");
            localDateTime1 = localDateTime1.plus(d);
            System.out.println("Before: " + localDateTime1.format(formatter2));
            System.out.println("-------------------------------------------");
        }
    }

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2002, Month.APRIL, 8);
        LocalTime localTime1 = LocalTime.of(10, 40, 0, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);

        LocalDate localDate2 = LocalDate.of(2012, Month.MARCH, 20);
        LocalTime localTime2 = LocalTime.of(8, 14, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);

        TestClassesDate testClassesDate = new TestClassesDate();
        testClassesDate.smena(localDateTime1, localDateTime2, Period.ofYears(1), Duration.ofHours(2));
    }
}

