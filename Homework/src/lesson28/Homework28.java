package lesson28;

public class Homework28 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Bob");
        Speakable speakable = new Pingvin("Snowy");
        Animal animal = new Lev("Stiv");
        Mammal mammal = new Lev("Barry");

        printVariable(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        printLine();

        speakable.speak();
        printLine();

        printVariable(animal.name);
        animal.eat();
        animal.sleep();
        printLine();

        printVariable(mammal.name);
        mammal.run();
        mammal.eat();
        mammal.speak();
        mammal.sleep();
        printLine();

        Animal animal1 = new Mechenosec("Ma");
        Animal animal2 = new Pingvin("Pa");
        Animal animal3 = new Lev("La");
        Fish fish1 = new Mechenosec("Mf");
        Bird bird1 = new Pingvin("Bb");
        Mammal mammal1 = new Lev("Lm");
        Pingvin pingvin = new Pingvin("Pp");
        Lev lev = new Lev("Ll");
        Speakable speakable1 = new Pingvin("Ps");
        Speakable speakable2 = new Lev("Ls");

        Animal[] arrayAnimal = {animal1, animal2, animal3, fish1, bird1, mammal1};
        Speakable[] arraySpeakable = {speakable1, speakable2, bird1, mammal1, pingvin, lev};

        for (int i = 0; i < arrayAnimal.length; i++) {
            if (arrayAnimal[i] instanceof Mechenosec) {
                System.out.println("aA instanceof Mechenosec, index - " + i);
                ((Mechenosec) arrayAnimal[i]).swim();
                methodsAnimal(arrayAnimal, i);
            }else
            if (arrayAnimal[i] instanceof Pingvin) {
                System.out.println("aA instanceof Pingvin, index - " + i);
                ((Pingvin) arrayAnimal[i]).speak();
                ((Pingvin) arrayAnimal[i]).fly();
                methodsAnimal(arrayAnimal, i);
            }else
            if (arrayAnimal[i] instanceof Lev) {
                System.out.println("aA instanceof Lev, index - " + i);
                ((Lev) arrayAnimal[i]).speak();
                ((Lev) arrayAnimal[i]).run();
                methodsAnimal(arrayAnimal, i);
            }
        }
        printLine();

        for (int i = 0; i < arraySpeakable.length; i++) {
            if (arraySpeakable[i] instanceof Pingvin) {
                System.out.println("aS instanceof Pingvin, index - " + i);
                printVariable(((Pingvin) arraySpeakable[i]).name);
                ((Pingvin) arraySpeakable[i]).sleep();
                ((Pingvin) arraySpeakable[i]).eat();
                ((Pingvin) arraySpeakable[i]).fly();
                methodsSpeakable(arraySpeakable, i);
            }else
            if (arraySpeakable[i] instanceof Lev) {
                System.out.println("aS instanceof Lev, index - " + i);
                printVariable(((Lev) arraySpeakable[i]).name);
                ((Lev) arraySpeakable[i]).eat();
                ((Lev) arraySpeakable[i]).sleep();
                ((Lev) arraySpeakable[i]).run();
                methodsSpeakable(arraySpeakable, i);
            }
        }
        printLine();
    }

    private static void printLine() {
        System.out.println("-----------------------------------");
    }

    private static void printVariable(String s) {
        System.out.println("Name: " + s);
    }

    private static void methodsAnimal(Animal[] arrayAnimal, int i) {
        printVariable(arrayAnimal[i].name);
        arrayAnimal[i].eat();
        arrayAnimal[i].sleep();
        printLine();
    }

    private static void methodsSpeakable(Speakable[] arraySpeakable, int i) {
        arraySpeakable[i].speak();
        printLine();
    }
}
