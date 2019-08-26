import java.util.Scanner;
import java.lang.String;
class static5
{
    static int a=77;
    static String my_str="Mia khalifaHD.com";
     void display()
     {
        System.out.println("The value of Integer is "+ a);
        System.out.println("Most Popular searching websities by youth "+ my_str);
     }
     void func()
     {
         display();
     }
  /*  static
    {
        System.out.println("Block 1");
        a=100;
        my_str="Aesop";
    }
    static 
    {
        System.out.println("Block 2");
        a=200;
        my_str="XXX videos.com";
    }               */
    public static void main(String[] args) {
        static5 obj1=new static5();
        obj1.func();
        obj1.display();
     /*   static5 obj2=new static5();
        obj1.a=88;
        obj1.my_str="Pornhub";
        obj2.a=90;
        obj2.my_str="Brazzers.com";
        System.out.println("The value of Num object-1 "+ obj1.a);
        System.out.println("The Value of  String object-1 is "+obj1.my_str);
        System.out.println("The value of Num object-2 "+ obj2.a);
        System.out.println("The value of String object-2 "+obj2.my_str);    */
    }
}