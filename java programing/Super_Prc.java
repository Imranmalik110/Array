import java.lang.String;
import java.util.Scanner;
class Base
{
    int a=100;
}
class child extends Base
{
    int a=110;
    void Display()
    {
        System.out.println(super.a);
    }
}
class Super_Prc
{
    public static void main(String[] args) {
        child obj=new child();
        obj.Display();
    }
}