import java.lang.String;
import java.util.Scanner;
class Example
{
    int a=4,b=5;
    Example
    {
        System.err.println("Constructor intilization Start here");
    }
    int Add()
    {
        return a*b;
    }
}
class Con1
{
    public static void main(String[] args) {
        Example obj=new Example();
        System.out.println(obj.Add());
    }
}