import java.lang.String;
import java.util.Scanner;
class Teacher 
{
    String designation="Teacher";
    String college_Name="Shayam lal college";
    void does()
    {
        System.out.println("Teaching");
    }
}
class Physics extends Teacher
{
    String main_subject="Physics";
}
class Inheritance_Three
{
    public static void main(String[] args) {
        Physics obj=new Physics();
        System.out.println("College Name "+obj.college_Name);
        System.out.println("Designation "+obj.designation);
        System.out.println("Main Subject "+obj.main_subject);
        obj.does();
    }
}