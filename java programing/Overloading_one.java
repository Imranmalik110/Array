import java.lang.String;
import java.util.Scanner;
class Child
{
   public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
/*    void Display()
    {
        System.out.println(a+b);            Fucntion can not call here 
        System.out.println(a+b+c);
    }                                       */ 
}
class Overloading_one
{
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println("Addition of Two Number is: "+obj.add(4,5));
        System.out.println(obj.add("Addition of Three number is: "+3,5,7)); 
    }
}