package lesson24;

public class Animal {
    public Animal(){
        System.out.println("I am an animal");
    }
    private int eyes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void drink(){
        System.out.println("Animal drinks");
    }

}
