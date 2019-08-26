import java.lang.String;
import java.util.Scanner;
class Student
{
    int Rno;
    String name;
    float per;
    Student(int roll,String stuname,float percantage)
    {
        Rno=roll;
        name=stuname;
        per=percantage;
    }
    void Display()
    {
        System.out.println("Roll number: "+Rno+"Name: "+name+"  per: "+per);
    }
    public static void main(String args[])
    {
        Student obj1=new Student(1,"Imran malik",48.3f);
        obj1.Display();
    }
}