package epam.homework1.homeworkB;

import java.util.Map;

public class Info implements I_Info {
    @Override
    public void printArray(Object[] o) {
        if (o instanceof Integer[]) {
            System.out.print("Result: ");
            for (Integer i : (Integer[]) o) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void printArray(String message, Object[] o) {
        if (o instanceof Integer[]) {
            System.out.print("Result " + message);
            for (Integer i : (Integer[]) o) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void printElem(String message, Object o) {
        if (o instanceof Integer) {
            System.out.print(message + o);
        }
        if (o instanceof Map)
        {
            System.out.println(o);
        }
        System.out.println();
    }

    @Override
    public void printArray(int[] o) {
        System.out.print("Result: ");
        for (Integer i : o) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
