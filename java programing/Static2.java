import java.lang.String;
import java.util.Scanner;
class Static2
{
    static int var;
    static String my_Str;
    public static void main(String arg[])
    {
        Static2 obj1=new Static2();
        Static2 obj2=new Static2();
        obj1.var=10;
        obj1.my_Str="Dell PC";
        obj2.var=15;
        obj2.my_Str="Welcome to the PC";
        System.out.println("The value of Object 1: "+obj1.var);
        System.out.println("The value of String object 1: "+obj1.my_Str);
        System.out.println("The value of Object 2: "+obj2.var);
        System.out.println("The value of String Object 2: "+obj2.my_Str);
    }
}