package lesson23;

public class Homework23 {

    private StringBuilder sBName;
    private int count;

    public StringBuilder getsBName() {
        StringBuilder builder = new StringBuilder(sBName); //temporary variable
        return builder;
    }

    public void setsBName(StringBuilder sBName) {
        this.sBName = sBName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void showData(){
        System.out.println("Name="+sBName+" count="+count);
    }
}

class Human{
    public String name;
    public int age;
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void showData(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
    public void live(){
        System.out.println("Live human");
    }
}

class Man extends Human{

    public Man(String name, int age){
        super(name,age);
    }
    @Override
    public void live(){
        System.out.println("Live Man");
    }

}

class Test23{
    public static void main(String[] args) {
        Homework23 homework23 = new Homework23();
        homework23.setCount(25);
        homework23.setsBName(new StringBuilder("Dima"));
        System.out.println(homework23.getsBName().append("!"));
        homework23.showData();

        Human human = new Man("Dima",19);
        human.showData();
        human.live();

    }
}