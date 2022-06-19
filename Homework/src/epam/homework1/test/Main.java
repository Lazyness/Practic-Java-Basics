package epam.homework1.test;

class A extends Exception
{
    static public void print()
    {
        System.out.println("A got caught ");
    }
}
class B extends A
{
    static public void print()
    {
        System.out.print("B got caught ");
    }
}

public class Main
{
    public static void main(String args[])
    {
        var builder = new StringBuilder("54321");
        builder.substring(2);
        System.out.println(builder.charAt(1));
    }

}