import java.lang.String;
import java.util.Scanner;
class Human
{
    void walk()
    {
        System.out.println("Human walks");
    }
}
class Boys extends Human
{
    void walk()
    {
        System.out.println("Boys walks");
    }
}
class Dynamic_Binding
{
    public static void main(String[] args) {
        Human obj=new Boys();
        Human obj1=new Human();
        obj.walk();
        obj1.walk();
    }
}