import java.lang.String;
import java.util.Scanner;
class A
{
    public void Display()
    {
        System.out.println("This is Super class");
    }
}
class B extends A
{
   public void Dis_Y()
    {
        System.out.println("This is Second Class");
    }
}
class C extends B
{
   public void Displ()
    {
        System.out.println("This is Last Class or derived Class");
    }
}
class In_Three
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.Display();
        obj.Dis_Y();
        obj.Displ();
    }
}