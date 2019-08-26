import java.lang.String;
import java.util.Scanner;
class Human
{
   static void walk()
    {
        System.out.println("Human Walks");
    }
}
class Boy extends Human
{
    static void walk()
    {
        System.out.println("Boys Walsk");
    }
}
class Static_Binding
{
    public static void main(String[] args) {
        Human obj=new Boy();
      //  obj.walk() ;                         Reference is human type and object is Boys type
        Human obj1=new Human();
        obj.walk();
        obj1.walk();
    }
}