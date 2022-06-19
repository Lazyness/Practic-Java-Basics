package lesson16.test;

import lesson11.Student;

public class TestClassString {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 3, "male");
        Student student2 = new Student("Dima", 3, "female");
        String s = new String("Yo");
        String s1 = s.replace('o','o');
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println();
        System.out.println(student1.getName()==student2.getName());
        System.out.println(student1.getName().equals(student2.getName()));
        String s2 = new String("ok");
        System.out.print("ok"==s2);
        System.out.println("-------");
    }
}
