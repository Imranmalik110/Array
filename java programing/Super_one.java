import java.lang.String;
import java.util.Scanner;
class Base
{
    int rno=100;
}
class Derived extends Base
{
   
    int id=100;
    void Display()
    {
        System.out.println(id);
    }
}
class Super_one
{
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.Display();
    }
}