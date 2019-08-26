import java.lang.String;
import java.util.Scanner;
class Mystring
{
    Mystring()
    {
        System.out.println("My Parents Class");
    }
}
class ChildString extends Mystring
{
    ChildString()
    {
        System.out.println("My Child Class");
    }
    public static void main(String args[])
    {
        new ChildString();
    }
}