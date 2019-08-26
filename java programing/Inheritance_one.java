import java.lang.String;
import java.util.Scanner;
class Animal
{
    void Eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Barking");
    }
}
class Inheritance_one
{
    public static void main(String args[])
    {
        Dog obj=new Dog();
        obj.Eat();
        obj.Bark();
    }
}