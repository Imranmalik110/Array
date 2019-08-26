import java.lang.String;
import java.util.Scanner;
class Encapsulation
{
    private int id;
    private String name;
    private int age;
    public int get_Id()
    {
        return id;
    }
    public String get_Name()
    {
        return name;
    }
    public int get_Age()
    {
        return age;
    }
    public void set_Id(int num)
    {
        id=num;
    }
    public void set_Name(String Name)
    {
        name=Name;
    }
    public void set_Age(int AGE)
    {
        age=AGE;
    }
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.set_Id(11);
        obj.set_Name("IMRAN Malik");
        obj.set_Age(21);
        System.out.println("Empolye Name "+obj.get_Name());
        System.out.println("Empolye Id "+obj.get_Id());
        System.out.println("Empolye Age "+obj.get_Age());
    }
}