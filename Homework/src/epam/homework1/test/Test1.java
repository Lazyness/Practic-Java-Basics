package epam.homework1.test;

public class Test1 {
    public static void main(String[] args) {
//        Student st1 = new Student("Dimasik", 20, 3, false);
//        Student st2 = new Student("Artem", 19, 3, false);
//        st1.printInfoAboutStudent();
//        st2.printInfoAboutStudent();
//        counter = 1;
//        swapStudent(st1, st2);
//        st1.printInfoAboutStudent();
//        st2.printInfoAboutStudent();

        ///////////////////\\\\\\\\\\\\\\\\\\\\
//        Bacteria bacteria = new MutagenMouse();
//        bacteria.printVar();
//        Animal animal = new MutagenMouse();
//        animal.printVar();
//        animal.eat();
//        animal.sleep();
//        MutagenMouse mouse = (MutagenMouse)animal;
//        mouse.printVar();
//        mouse.eat();
//        mouse.sleep();
 test();
    }
    static boolean foo1()
    {
        System.out.print("foo1()");
        return true;
    }
    static boolean foo2()
    {
        System.out.print("foo2()");
        return false;
    }
    public static void test(){
        boolean bool;
        bool = foo1()||foo2();
        System.out.print(" ");
        bool = foo1()&&foo2();
        System.out.print(" ");
        bool = foo2()||foo1();
        System.out.print(" ");
        bool = foo2()&&foo1();
    }
}

class Student {
    String name;
    int age;
    int course;
    boolean isHaveJob;
    static int counter = 1;

    public Student(String name, int age, int course, boolean isHaveJob) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.isHaveJob = isHaveJob;
    }

    public static void swapStudent(Student first, Student second) {
        Student temp = new Student(null, 0, 0, false);
        temp.name = first.name;
        temp.age = first.age;
        temp.course = first.course;
        temp.isHaveJob = first.isHaveJob;

        first.name = second.name;
        first.age = second.age;
        first.course = second.course;
        first.isHaveJob = second.isHaveJob;

        second.name = temp.name;
        second.age = temp.age;
        second.course = temp.course;
        second.isHaveJob = temp.isHaveJob;
    }

    public void printInfoAboutStudent() {
        System.out.println("Student #" + counter + "-> name: " + name + " age: " + age + " course: " + course + " isHaveJob: " + isHaveJob);
        counter++;
    }
}

class Bacteria{
    static String name = "Bac";
    static int countPaws = 0;
    static int countTails = 0;

    void printVar() {
        System.out.println("Name: " + name + " countPaws: " + countPaws + " countTails: " + countTails);
    }
}
abstract class Animal extends Bacteria{
    static String name = "Kill";
    static int countPaws = 4;
    static int countTails = 1;

    void printVar() {
        System.out.println("Name: " + name + " countPaws: " + countPaws + " countTails: " + countTails);
    }
    abstract void eat();
    abstract void sleep();
}
class MutagenMouse extends Animal {
    static String name = "Mik";
    static int countPaws = 6;
    static int countTails = 2;

    void eat() {
        System.out.println("Mouse eat!");
    }

    void sleep() {
        System.out.println("Mouse sleep");
    }

    void printVar() {
        System.out.println("Name: " + name + " countPaws: " + countPaws + " countTails: " + countTails);
    }

}
class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("cat eat");
    }

    @Override
    void sleep() {
        System.out.println("cat sleep");
    }
    void printVar() {
        System.out.println("Name: " + name + " countPaws: " + countPaws + " countTails: " + countTails);
    }
}