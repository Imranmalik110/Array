import java.lang.String;
import java.util.Scanner;
class Base
{
    final void demo()
    {
        System.out.println("All is Well");
    }
}
class Final extends Base
{
    public static void main(String[] args) {
        Final obj=new Final();
        obj.demo();
    }
}