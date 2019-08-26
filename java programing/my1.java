import java.lang.String;
import java.util.Scanner;
class Teacher
{
    String designation="Teacher";
    String college="Shayam lal college";
    public void getdesignation()
    {
        return designation;
    }
    protected void setdesignation() {
        this.designation=designation;
    }
    public void getcollege()
    {
        return college;
    } 
    protected void setcollege() {
        this.college=college;
    }
}
public class Physics extends Teacher
{
    String subject="Physics";
}
class my1
{
    public static void main(String[] args) {
        Physics obj=new Physics();
        System.out.println(obj.getcollege);
        System.out.println(obj.getdesignation);
        System.out.println(obj.subject);
    }
}