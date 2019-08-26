import java.lang.String;
import java.util.Scanner;
class Base
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
class My4
{
    public static void main(String[] args) {
        Base obj=new Base();
        System.err.println("Additon of Two +"+obj.add(12,34));
        System.err.println("Addition of Three +"+obj.add(12,34,56));
    }
}