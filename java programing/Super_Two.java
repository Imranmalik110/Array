import java.lang.String;
import java.util.Scanner;
class Base
{
    Base()
    {
        System.out.println("This is the Base Class");
    }
}
class Child extends Base
{
    Child()
    {
        System.out.println("This is The Child Class");
    }
    Child(int num)
    {
        System.out.println("Args constructor of Child class");
    }
    void Display()
    {
        System.out.println("Hello");
    }
}
class Super_Two
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.Display();
        Child obj1=new Child(10);
        obj1.Display();
    }
}