import java.lang.String;
import java.util.Scanner;
class Shape
{
    int a,b,res;
    Scanner in=new Scanner(System.in);
    void Get_value()
    {
        System.out.println("Enter the value of A and B: ");
        a=in.nextInt();
        b=in.nextInt();
    }
    void Res()
    {
        res=a*b;
        System.out.println("Result is: "+res);
    }   
}
class Square extends Shape
    {
        void Display()
        {
            res=(a*a)*(b*b);
            System.out.println("Result is: "+res);
        }
    }
    class Inheritance
    {
        public static void main(String args[])
        {
            Square obj=new Square();
            obj.Get_value();
            obj.Display();
            System.out.println("Shape class Result:");
            obj.Get_value();
            obj.Res();
    }
}