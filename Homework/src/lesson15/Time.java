package lesson15;

public class Time {
    public static void printHourMinuteSecond() {
        int hour = 0;
        OUTER:
        while (hour <= 6) {
            int minutes = -1;
            MIDDLE:
            do {
                minutes++;
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                while (second <= 59) {
                    if (second * hour > minutes) continue MIDDLE;
                    System.out.println(hour+":"+minutes+":"+second);
                    second++;
                }

            } while (minutes <= 58);
            hour++;
        }
    }

    public static void main(String[] args) {
        printHourMinuteSecond();
    }
}