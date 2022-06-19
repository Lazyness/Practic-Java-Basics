package lesson17;

public class Test {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder("Lo");
        StringBuilder builder2 = new StringBuilder("Lo");

        System.out.println(builder1.equals(builder2));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
