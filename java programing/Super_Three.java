import java.lang.String;
import java.util.Scanner;
class Base
{
    Base()
    {
        System.out.println("Without Args Constructor");
    }
    Base(String name)
    {
        System.out.println("Parameterized consturcotr");
    }
}
class Child extends Base
{
    Child()
    {
        super("Hahaha");
        System.out.println("This is the Child Class");
    }
    void Display()
    {
        System.out.println("Hello");
    }
}
class Super_Three
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.Display();
    }
}