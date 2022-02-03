package lesson12;

import lesson11.Student;

public class StudentTest {

    public static void equalStudents(Student st1, Student st2) {
        if (st1.getCourse() == st2.getCourse() &&
                st1.getMaleOrFemale().equals(st2.getMaleOrFemale()) &&
                st1.getName().equals(st2.getName())) {
            System.out.println("Student have equal name, course, male/female");
        } else
            System.out.println("Student have in status difference");
    }

    public static void equalStudentsMore(Student st1, Student st2) {
        boolean flag = false;
        if (st1.getCourse() == st2.getCourse()) {
            System.out.println("Student have equal course");
        } else {
            System.out.println("Student have not equal course");
        }
        if (st1.getMaleOrFemale().equals(st2.getMaleOrFemale())) {
            System.out.println("Student have equal male/female");
        } else {
            System.out.println("Student have not equal male/female");
        }
        if (st1.getName().equals(st2.getName())) {
            System.out.println("Student have equal name");
        } else {
            System.out.println("Student have not equal name");
        }

    }

    public static void main(String[] args) {
        Student student1 = new Student("Masha", 3, "male");
        Student student2 = new Student("Dima", 3, "male");
        equalStudents(student1, student2);
        System.out.println("------------");
        equalStudentsMore(student1, student2);
    }
}
