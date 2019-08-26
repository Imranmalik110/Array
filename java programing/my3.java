import java.lang.String;
import java.util.Scanner;
class Base
{
    Base()
    {
        System.out.println("Constructor of Base Class");
    }
    void Display()
    {
        System.out.println("This is the Base Class");
    }
}
class Child extends Base
{
    Child()
    {
        System.out.println("Constructor of Child class");
    }
    void Display()
    {
        System.out.println("This is Child Class");
    }
    void Show()
    {
        Display();
        super.Display();
    }
}
class my3
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.Show();
    }
}