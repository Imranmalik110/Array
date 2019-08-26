import java.lang.String;
import java.util.Scanner;
class A
{
    public void Display()
    {
        System.out.println("This is Base Classs");
    }
}
class B extends A
{
    public void Display_X()
    {
        System.out.println("This is B class");
    }
}
class C extends A
{
    public void Display_Y()
    {
        System.out.println("This is C class");
    }
}
class D extends A
{
    public void Display_Z()
    {
        System.out.println("This is D class Element");
    }
}
class In_H
{
    public staitc void main(String args[])
    {
        D obj=new D();
        C obj1=new C();
        B obj2=new B();
        obj.Display();
        obj.Display_Z();
        obj2.Display_X();
        obj1.Display_Y();
    }
}