import java.lang.String;
import java.util.Scanner;
class Student
{
    int rno;
    String name;
    float weight;
    Student(int rno, String name,float weight)
    {
        this.rno=rno;
        this.name=name;
        this.weight=weight;
    }
}
class OPPS
{
    public static void main(String[] args) {
        Student obj=new Student(11,"Imran",38.34f);
        System.out.println("Roll number "+obj.rno+ " Name "+obj.name+ " Weight "+obj.weight);
    }
}