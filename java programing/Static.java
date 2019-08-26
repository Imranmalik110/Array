import java.lang.String;
import java.util.Scanner;
class Static
{
    static int num;
    static String my_str;
    static
    {
        System.out.println("Static block 1");
        num=10;
        my_str="Java Static Keyword Use";
    }
    static 
    {
        System.out.println("Static block 2");
        num=100;
        my_str="IMRAN MALIK";
    }
    public static void main(String args[])
    {
        System.out.println("The value of Num "+num);
        System.out.println("The value of String :\n"+my_str);
    }
}