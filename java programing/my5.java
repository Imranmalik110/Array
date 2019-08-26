import java.lang.String;
import java.util.Scanner;
class Base
{
    public void display(char c) {
        System.err.println(c);
    }
    public static void display(char c,int num) {
        System.out.println(c+ " "+num);
    }
}
class my5
{
    public static void main(String[] args) {
        Base obj=new Base();
        obj.display('a');
        obj.display('a',20);
    }
}