
import java.lang.String;
import java.util.Scanner;
class Variable
{
    String my_str="Instance variable";
    void Method()
    {
        String str="Inside function";
        System.out.println(str);
    }
    public static void main(String[] args) {
        Variable obj=new Variable();
        System.out.println("Calling method");
        obj.Method();
        System.out.println(obj.my_str);
    }
}