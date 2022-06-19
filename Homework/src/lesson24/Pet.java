package lesson24;

public class Pet extends Animal{
    public Pet(){
        System.out.println("I am Pet");
        setEyes(2);
    }

    private String name;
    private int tail = 1;
    private int paw = 4;

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }
}
