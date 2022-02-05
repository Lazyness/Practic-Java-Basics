package lesson14;

public class Time {

    public static void printHourMinuteSecond() {
        OUTER:
        for (int i = 0; i <= 6; i++) {
            MIDDLE:
            for (int j = 0; j <= 59; j++) {
                if (i > 1 && j % 10 == 0) {
                    break OUTER;
                }
                for (int k = 0; k <= 59; k++) {
                    if (k * i > j) continue MIDDLE;
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        printHourMinuteSecond();
    }

}
