package lesson20;

import java.util.ArrayList;

public class Homework20 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dima");
        arrayList.add("Olesya");
        ArrayList<String> arrayListClone = (ArrayList<String>) arrayList.clone();
        System.out.println(arrayListClone==arrayList);

    }
}
