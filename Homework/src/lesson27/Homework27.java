package lesson27;

import java.util.ArrayList;

public class Homework27 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.floor(11*(i+Math.random())%5));
        }
        System.out.println("ArrayList<Integer>: ");
        for (Double d:arrayList) {
            System.out.println("\t"+d+" ");
        }
    }
}
