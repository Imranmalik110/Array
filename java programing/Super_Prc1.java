import java.lang.String;
import java.util.Scanner;
class Base
{
    Base()
    {
        System.out.println("Constructor of Base class");
    }
}
class child extends  Base
{
    child()
    {
        System.out.println("Constructor of Child class");
    }
    child(int num)
    {
        System.out.println("Args constructor called");
    }
    //super("IMRAN MALIK");
    void show()
    {
        System.out.println("Hello");
    }
}
class Super_Prc1
{
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}