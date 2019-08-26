import java.lang.String;
import java.util.Scanner;
abstract class Base
{
    abstract int mul(int n1,int n2);
    abstract int mul(int n1,int n2,int n3);
    void display()
    {
        System.out.println("Abstract Class Method are Here");
    }
}
class Child extends Base
{
    int mul(int num1,int num2)
    {
        return num1*num2;
    }
    int mul(int num1,int num2,int num3)
    {
        return num1*num2*num3;
    }
}
class Abstract_Method_one
{
    public static void main(String[] args) {
        Base obj=new Child();
        System.out.println("Multiplication of Two Number "+obj.mul(4,7));
        System.out.println("Multiplication of Three Number "+obj.mul(4,6,7));
        obj.display();
    }
}
