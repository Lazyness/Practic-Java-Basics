package lesson9.homework;

public class Homework9 {
    private String pen;
    public static int count;

    Homework9(String pen) {
        this.pen = pen;
        count++;
    }
    public static void createTempObject(){
        Homework9 hw9_1 = new Homework9("Aragoto#9010");
        Homework9 hw9_5 = new Homework9("Aragoto#9016");
    }
}

class Test9 {
    public static void main(String[] args) {
        Homework9.createTempObject();
        Homework9.createTempObject();
        Homework9.createTempObject();
        Homework9.createTempObject();
        System.out.println(Homework9.count);
    }
}

//1- error
//2- 5,2;
//3- 2,4,1,2