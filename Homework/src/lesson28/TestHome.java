package lesson28;

public class TestHome {
    public static void main(String[] args) {
        Display display = new Display();
    }
}

class Phone {
    Phone() {
        System.out.println("constructor Phone");
    }

    {
        System.out.println("init block Phone");
    }

    static {
        System.out.println("static init block Phone");
    }

    Phone methodTest() {
        return new Phone();
    }
}

class Display extends Phone {
    Display() {
        System.out.println("constructor Display");
    }

    {
        System.out.println("init block Display");
    }

    static {
        System.out.println("static init block Display");
    }

    @Override
    Display methodTest() {
        return new Display();
    }
}
