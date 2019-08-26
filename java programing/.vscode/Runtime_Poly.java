import java.lang.String;
import java.util.Scanner;
class  Base
{
    void show()
    {
        System.out.println("Animals sound");
    }
}
class child extends Base
{
    void show()
    {
        System.out.println("Bark");
    }
}
class Runtime_Poly
{
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
    }
}