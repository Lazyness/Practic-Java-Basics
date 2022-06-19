package lesson32;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    static void printEmployee(Employee employee) {
        System.out.println("About this Employee -> Name: " +
                employee.getName() + " Department: " + employee.getDepartment() +
                " Salary: " + employee.getSalary());
    }

    static void filterEmployee(ArrayList<Employee> list, Predicate<Employee> pE) {
        for (Employee e : list) {
            if (pE.test(e)) printEmployee(e);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Dima", "IT", 720));
        employeeArrayList.add(new Employee("Anya", "QA", 150));
        employeeArrayList.add(new Employee("Artem", "IT", 690));
        employeeArrayList.add(new Employee("Jenya", "IT", 170));
        employeeArrayList.add(new Employee("Sasha", "Cyber Security", 700));

        filterEmployee(employeeArrayList, e -> e.getDepartment().equals("IT") && e.getSalary() > 200);
        filterEmployee(employeeArrayList, e -> e.getName().startsWith("A") && e.getSalary() != 450);
        filterEmployee(employeeArrayList, e -> e.getName().equals(e.getDepartment()));
    }
}