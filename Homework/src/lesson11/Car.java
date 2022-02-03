package lesson11;

public class Car {
    public String color;
    public String engine;
    public int countDoor;

    Car(String color, String engine, int countDoor) {
        this.color = color;
        this.engine = engine;
        this.countDoor = countDoor;
    }
}

class CarTest {
    public static void changeCountDoor(Car car, int count) {
        car.countDoor = count;
    }

    public static void swapColor(Car c1, Car c2) {
        String tempColor = c1.color;
        c1.color = c2.color;
        c2.color = tempColor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("white", "Engine568Bw", 12);
        Car car2 = new Car("black", "Eng90Zilla", 41);
        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println(car1.countDoor);
        System.out.println("-------------");
        System.out.println(car2.color);
        System.out.println(car2.engine);
        System.out.println(car2.countDoor);
        System.out.println("-------------");
        System.out.println("-------------");
        changeCountDoor(car1,15);
        swapColor(car1, car2);
        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println(car1.countDoor);
        System.out.println("-------------");
        System.out.println(car2.color);
        System.out.println(car2.engine);
        System.out.println(car2.countDoor);
    }
}
