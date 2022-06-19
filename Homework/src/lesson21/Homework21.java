package lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class Homework21 {
    public static ArrayList<String> abc(String... str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String strings : str) {
            if (!arrayList.contains(strings)) //не добавляем повторы
                arrayList.add(strings);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void showArray(ArrayList arrayList) {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        showArray(abc("1", "9", "6", "3", "8", "9", "1"));
    }
}
