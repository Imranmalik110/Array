import java.lang.String;
import java.util.Scanner;
 abstract class Base
{
    abstract int Two_Sum(int n1,int n2);
    abstract int Three_Sum(int n1,int n2,int n3);
    void Display()
    {
        System.out.println("Class Method");
    }
}
class Child extends Base
{
    int Two_Sum(int num1,int num2)
    {
        return num1*num2;
    }
    int Three_Sum(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
}
class Astract_Method
{
    public static void main(String[] args) {
        Base obj=new Child();
        System.out.println("Addition of Two Number "+(obj.Two_Sum(12,34)));
        System.out.println("Addition of Three Number "+(obj.Three_Sum(12,45,67)));
        obj.Display();
    }
}