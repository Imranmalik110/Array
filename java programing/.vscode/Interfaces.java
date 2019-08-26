import java.lang.String;
import java.util.Scanner;
interface my_interface
{
  public  void method_one();
   public void method_Two();
}
class Demo implements my_interface
{
   public void method_one()
    {
        System.out.println("Implement Method 1");
    }
   public void method_Two()
    {
        System.out.println("Implement Method 2");
    }
}
class Interfaces
{
    public static void main(String[] args) {
        my_interface obj=new Demo();
        obj.method_Two();
        obj.method_one();
    }
}