package lesson8.homework;

import static java.lang.Math.pow;

public class Homework8 {
    public static final float PI = 3.14f;

    public static int mul(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public static void del(int n1, int n2) {
        System.out.println("Целая часть: " + n1 / n2 + " Остаток: " + n1 % n2);
    }

    public double square(int radius) {
        return PI * pow(radius, 2);
    }

    public static double lengthCircle(int radius) {
        return 2 * PI * radius;
    }

    public void info(int radius) {
        System.out.println("\n Radius: " + radius + ",\n Площадь круга: " + square(radius) + ",\n Длинна окружности: " + lengthCircle(radius));
        square(radius);
        lengthCircle(radius);
    }
}

class Test8 {

    public static void main(String[] args) {
        System.out.println(Homework8.mul(5, 6, 7));
        Homework8.del(10, 3);

        System.out.println(Homework8.mul(7, 8, 9));
        Homework8.del(9, 5);

        Homework8 homework8 = new Homework8();
        homework8.info(10);
        System.out.println();
        System.out.println("Площадь круга: "+homework8.square(15));
        System.out.println("Длинна окружности: "+Homework8.lengthCircle(15));
    }
}
