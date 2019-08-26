import java.lang.String;
import java.util.Scanner;
class Base
{
    void Display()
    {
        System.out.println("HELLO MR IMRAN  MALIK");
    }
}
class Child extends Base
{
    void show()
    {
        Display();
    }
}
class my4
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}