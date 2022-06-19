package epam.homework1.homeworkB;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkB extends Info {
    public static void main(String[] args) {
        HomeworkB homeworkB = new HomeworkB();
        while (true) {
            if (!homeworkB.start()) break;
        }
    }

    private boolean start() {
        System.out.println("Welcome!\nThis system asks you to choose the number from 1 to 16.");
        System.out.println("1. Четные и нечетные числа.\n" +
                "2. Наибольшее и наименьшее число.\n" +
                "3. Числа, которые делятся на 3 или на 9.\n" +
                "4. Числа, которые делятся на 5 и на 7.\n" +
                "5. Элементы, расположенные методом пузырька по убыванию модулей.\n" +
                "6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.\n" +
                "7. Наибольший общий делитель и наименьшее общее кратное этих чисел.\n" +
                "8. Простые числа.\n" +
                "9. Отсортированные числа в порядке возрастания и убывания.\n" +
                "10. Числа в порядке убывания частоты встречаемости чисел.\n" +
                "11. «Счастливые» числа.\n" +
                "12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).\n" +
                "13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.\n" +
                "14. Элементы, которые равны полусумме соседних элементов.\n" +
                "15. Период десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд.\n" +
                "16. Построить треугольник Паскаля для первого положительного числа.");
        System.out.print("Your choose: ");
        try {
            Scanner scannerNum = new Scanner(System.in);
            int chooseNumber = scannerNum.nextInt();

            String[] arrString = scanStr().split(" ");
            switch (chooseNumber) {
                case 1: {
                    evenOddNumbers(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 2: {
                    findMaxMinNumbers(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 3: {
                    findNumDelThreeOrNine(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 4: {
                    findNumDelFiveOrSeven(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 5: {
                    sortDESC(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 6: {
                    differenceThreeDecaNumbs(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 10: {
                    findIntElement(castStrArrIntoIntArr(arrString));
                    break;
                }
                case 12:{
                    System.out.println(fiboNumb(castStrArrIntoIntArr(arrString)));
                    break;
                }
                default:
                    System.out.println("You enter incorrect number!\nEnter again, please...");
            }
            System.out.print("You want to continue?\nPlease enter your answer... ");
            Scanner scannerAnswer = new Scanner(System.in);
            String str = scannerAnswer.nextLine();
            if (str.equalsIgnoreCase("Yes")) {
                return true;
            } else if (str.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.out.println("You enter something wrong...");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //4 8 6 6 5 7 6 3 5 4 4 5 6 7 2 0 1 8 6
    private int findIntElement(int[] arrNumbsNoSort) {
        return 0;
    }

    private int fiboNumb(int... arrNumbs) {
        if (arrNumbs[0] == 0 || arrNumbs[0] == 1) return 1;
        return fiboNumb(arrNumbs[0] - 1) + fiboNumb(arrNumbs[0] - 2);
    }

    private int[] sortASC(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[i];
                    arrayNumbers[i] = temp;
                }
            }
        }
//        printArray(arrayNumbers);
        return arrayNumbers;
    }

    private void differenceThreeDecaNumbs(int[] arrNumbs) {
        Integer[] temp = new Integer[0];
        int counter = 0;
        for (int i = 0; i < arrNumbs.length; i++) {
            if (arrNumbs[i] / 100 > 0 && arrNumbs[i] / 100 < 10) {
                //100-999
                int secondStateNumb = arrNumbs[i] / 10 % 10;
                int thirdStateNumb = arrNumbs[i] % 10;
                if (secondStateNumb != thirdStateNumb) {
                    temp = Arrays.copyOf(temp, temp.length + 1);
                    temp[counter++] = arrNumbs[i];
                }
            }
        }
        printArray(temp);
    }

    private void sortDESC(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] < arrayNumbers[j]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[i];
                    arrayNumbers[i] = temp;
                }
            }
        }
        printArray(arrayNumbers);
    }

    private void findNumDelFiveOrSeven(int[] arrayNumbers) {
        Integer[] arrDel = new Integer[0];
        int counterDelOnThree = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 5 == 0 && arrayNumbers[i] % 7 == 0) {
                if (arrayNumbers[i] == 0) continue;
                arrDel = Arrays.copyOf(arrDel, arrDel.length + 1);
                arrDel[counterDelOnThree++] = arrayNumbers[i];
            }
        }
        printArray("Numbs what del on 5 and 7: ", arrDel);
    }

    private void findNumDelThreeOrNine(int[] arrayNumbers) {
        Integer[] arrDelOnThree = new Integer[0];
        Integer[] arrDelOnNine = new Integer[0];
        int counterDelOnThree = 0, counterDelOnNine = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == 0) continue;
            if (arrayNumbers[i] % 3 == 0) {
                arrDelOnThree = Arrays.copyOf(arrDelOnThree, arrDelOnThree.length + 1);
                arrDelOnThree[counterDelOnThree++] = arrayNumbers[i];
            }
            if (arrayNumbers[i] % 9 == 0) {
                arrDelOnNine = Arrays.copyOf(arrDelOnNine, arrDelOnNine.length + 1);
                arrDelOnNine[counterDelOnNine++] = arrayNumbers[i];
            }
        }
        printArray("Numbs what del on 3: ", arrDelOnThree);
        printArray("Numbs what del on 9: ", arrDelOnNine);
    }

    private void findMaxMinNumbers(int[] arrayNumbers) {
        int minNum = arrayNumbers[0];
        int maxNum = minNum;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (minNum > arrayNumbers[i]) minNum = arrayNumbers[i];
            if (maxNum < arrayNumbers[i]) maxNum = arrayNumbers[i];
        }
        printElem("Your min elem: ", minNum);
        printElem("Your max elem: ", maxNum);
    }

    private void evenOddNumbers(int[] arrayNumbers) {
        Integer[] arrEven = new Integer[0];
        Integer[] arrOdd = new Integer[0];
        int counterEven = 0, counterOdd = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                arrEven = Arrays.copyOf(arrEven, arrEven.length + 1);
                arrEven[counterEven++] = arrayNumbers[i];
            } else {
                arrOdd = Arrays.copyOf(arrOdd, arrOdd.length + 1);
                arrOdd[counterOdd++] = arrayNumbers[i];
            }
        }
        printArray("Even array: ", arrEven);
        printArray("Odd array: ", arrOdd);
    }

    private static int[] castStrArrIntoIntArr(String[] arrNumbers) {
        int[] arrNums = new int[arrNumbers.length];
        for (int i = 0; i < arrNumbers.length; i++) {
            try {
                arrNums[i] = Integer.parseInt(arrNumbers[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return arrNums;
    }

    private static String scanStr() {
        System.out.print("Enter your numbers: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
