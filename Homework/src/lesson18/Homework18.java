package lesson18;

import java.util.Arrays;

public class Homework18 {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static void sortInsertion(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void printArray(int[] arr) {
        System.out.print("Your array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.print(arr[i][j]);
                } else
                    System.out.print(arr[i][j] + ", ");
            }
            if (i == arr.length - 1) {
                System.out.print("}");
            } else System.out.print("}, ");
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        printArray(sort(new int[]{10, 2, 19, 3, 1, 2, 5}));
        showArray(new String[][]{{"Hello", "Dear"},
                {"Afraid", "Poison", "Master"},
                {"Cry", "Hard", "Work"},
                {"Kata"}
        });
    }

}
