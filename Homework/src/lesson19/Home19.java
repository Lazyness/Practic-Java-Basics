package lesson19;

public class Home19 {
    public static String[] abc(String[]... arr) {
        int countArraysElement = 0;

        for (String[] sizeArr : arr) {
            countArraysElement += arr.length;
        }
        String[] arrayTemp = new String[countArraysElement];
        for (int i = 0, k = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, k++) {
                arrayTemp[k] = arr[i][j];
            }
        }
        return arrayTemp;
    }

    public static void main(String[] args) {
        String[] array = abc(new String[]{"Hello", "Jio"},
                new String[]{"Kalli", "Miva"});
        for (String var : array) {
            System.out.println(var + " ");
        }
    }
}

class TestHome19 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("one");
        StringBuilder stringBuilder2 = new StringBuilder("two");
        StringBuilder stringBuilder3 = new StringBuilder("three");

        StringBuilder[] arrayStr = {stringBuilder1, stringBuilder2, stringBuilder3};

        printStrB(arrayStr);
        for (StringBuilder strb : arrayStr) {
            strb.append("Java");
        }
        printStrB(arrayStr);

        int a = 9, b = 10, c = 11;
        int[] arr = {a, b, c};
        printIntArr(arr);
        for (int f : arr) {
            f = 1;
        }
        printIntArr(arr);

    }

    private static void printIntArr(int[] arr) {
        for (int o : arr) {
            System.out.println(o);
        }
        System.out.println();
    }

    private static void printStrB(StringBuilder[] arrayStr) {
        for (StringBuilder stringBuilder : arrayStr
        ) {
            System.out.println(stringBuilder);
        }
    }
}