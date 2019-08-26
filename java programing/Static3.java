import java.lang.String;
import java.util.Scanner;
class Static3
{
    static int var=10;
    static String my_Str="Start your PC";
    static void Display()
    {
        System.out.println("The value of Var: "+var);
        System.out.println("The value of String: "+my_Str);
    }
    void fuction()
    {
        Display();
    }
    public static void main(String args[])
    {
        Static3 obj=new Static3();
        obj.fuction();
        Display();
    }
}