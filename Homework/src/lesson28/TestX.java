package lesson28;

public class TestX {
    static void a(int s){
        System.out.println(" "+s);
    }
    static {a(5);}
    TestX(){
        a(9);
    }
    static {a(7);}

    {
        a(88);
    }
    static {new TestX();}

    public static void main(String[] args) {

    }
}
