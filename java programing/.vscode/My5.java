import java.lang.String;
import java.util.Scanner;
class Overload 
{
    void demo(int a)
    {
        System.out.println("A "+a);
    }
    void demo(int a,int b)
    {
        System.out.println("A "+a+" ,"+b);
    }
    double demo(double a)
    {
        System.out.println("Double A"+a);
        return a*a;
    }
}
class My5
{
    public static void main(String[] args) {
        Overload obj=new Overload();
        double res;
        obj.demo(13);
        obj.demo(12,45);
        res=obj.demo(4.5);
        System.out.println("Result is "+res);
    }
}