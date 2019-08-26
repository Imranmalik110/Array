import java.lang.String;
import java.util.Scanner;
class Base
{
    void Display()
    {
        System.out.println("This is  the Base classs");
    }
}
class Child extends Base
{
    void Display()
    {
        System.out.println("This is Child Class");
    }
    void MSG()
    {
        Display();
        super.Display();
    }
}
class Super_Four
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.MSG();
    }
}