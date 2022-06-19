package epam.homework1.homeworkA;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class HelloUser {

    private String lastName;
    private Date date;

    public static void main(String[] args) {
        HelloUser helloUser = new HelloUser();
//        helloUser.setDataEmployee();
//        helloUser.getDataEmployee();
        helloUser.p();
    }

    public void p(){
        String s;
        if ((s = "java") == "java") {// 2
            System.out.println (s+ " true");
        } else {
            System.out.println (s+ " false");
        }
    }

    private void setDataEmployee() {
        System.out.print("Enter last name: " );
        date = new Date();
        Scanner scanner = new Scanner(System.in);
        lastName = scanner.nextLine();
        System.out.println("setDataEmployee!");
        System.out.println("Delivery Date: " + date);
    }

    private void getDataEmployee() {
        System.out.println("getDataEmployee!");
        System.out.println("Last name programmer: "+lastName);
        System.out.println("Date of receipt: "+date);
    }

    private void sunArgsNum(String... arg) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < arg.length; i++) {
            try {
                sum += Integer.parseInt(arg[i]);
            } catch (Exception e) {
                flag = true;
            }
        }
        if (!flag)
            System.out.println(sum);
    }

    private void consolePassword() {
        String defaultPassword = "qwerty20021976";
        System.out.print("Enter your password: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals(defaultPassword)) {
            System.out.println("Password is equals!");
        } else {
            System.out.println("Password isn't equals!");
        }
    }

    private void randomNumber(String... args) {
        if (args.length == 1) {
            int countRandom = Integer.parseInt(args[0]);
            for (int i = 0; i < countRandom; i++) {
                System.out.print(new Random().nextInt(2) * countRandom + " ");
            }
        } else {
            System.out.println("You enter too much args...");
        }
    }

    private void reverseArgs(String... args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }

    private void printHelloUser() {
        try {
            System.out.print("Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("Hello user, " + name);
        } catch (Exception e) {

        }
    }
}
