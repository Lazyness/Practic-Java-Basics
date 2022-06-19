package lesson28;

abstract public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Always interesting see, how sleep fish!");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Name: " + name + "sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
    }
    @Override
    public void swim(){
        System.out.println("Mechenosec beautiful fish, which quickly swim!");
    }
    @Override
    public void eat(){
        System.out.println("Mechenosec do not predatory fish, and it eat simple fisher!");
    }
}

class Pingvin extends Bird{
    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Penguins doesn't know how to sing like a nightingale!");
    }

    @Override
    void fly() {
        System.out.println("Penguin doesn't know how to fly!");
    }

    @Override
    void eat() {
        System.out.println("Penguin like to eat fish!");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep near pressing each other!");
    }
}

class Lev extends Mammal{
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lion like any predator loves meat!");
    }

    @Override
    void sleep() {
        System.out.println("Most of the day lion sleeps!");
    }

    @Override
    void run() {
        System.out.println("Lion isn't the fastest cat!");
    }
}

