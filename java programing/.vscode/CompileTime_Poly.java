import java.lang.String;
import java.util.Scanner;
class Overload
{
    void fuc(int a)
    {
        System.out.println("a "+ a);
    }
    void fuc(int a,int b)
    {
        System.out.println("A "+a+","+b);
    }
    double fuc(double a)
    {
        System.out.println("Double A "+a);
        return a*a;
    }
}
class CompileTime_Poly
{
    public static void main(String[] args) {
        Overload obj=new Overload();
        double res;
        obj.fuc(10);
        obj.fuc(28,45);
        res=obj.fuc(4.5);
        System.out.println("Result is "+res);
    }
}