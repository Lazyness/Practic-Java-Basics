package lesson25;

public class Homework25 {
    void check(Test25 test25) {
        System.out.println("Test25");
    }

    void check(ChildTest25 childTest25) {
        System.out.println("childrenTest25");
    }

    public static void main(String[] args) {
        ChildTest25 test25 = new ChildTest25();
        test25.test();
        Homework25 homework25 = new Homework25();
        homework25.check(test25);

    }
}

class Test25 {

    static void methodOverriding() {
        System.out.println("method parent Overrading");
    }
}

class ChildTest25 extends Test25 {
    void test(){ super.methodOverriding();}
    static void methodOverriding() {
        System.out.println("method child Overrading");
    }
}
