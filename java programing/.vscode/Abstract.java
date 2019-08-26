import java.lang.String;
import java.util.Scanner;
 abstract class Animal
{
    public abstract void sound();
}
class Dog extends Animal
{
 public   void sound()
    {
        System.out.println("Woof");
    }
}
class Abstract
{
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
    }
}