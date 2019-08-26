import java.lang.String;
import java.util.Scanner;
class Base
{
    Base()
    {
        System.out.println("Constructor Without argument");
    }
    Base(String a)
    {
        System.out.println("Parameterized Constructor");
    }
}
class child extends Base
{
    child()
    {
        super("DELL PC");
        System.out.println("Constructor of Child Class");
    }
    void show()
    {
        System.out.println("Hello");
    }
}
class My2
{
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
    }
}