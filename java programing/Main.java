import java.lang.String;
import java.util.Scanner;
class Address
{
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street,String c,String st,String coun)
    {
        this.streetNum=street;
        this.city=c;
        this.state=st;
        this.country=coun;
    }
}
class Student
{
    int rollnum;
    String studentName;
    Address studentAddr;
    Student(int rno,String name,Address addr)
    {
        this.rollnum=rno;
        this.studentName=name;
        this.studentAddr=addr;
    }
}
class Main 
{
    public static void main(String[] args)
    {
          Address ad=new Address(55,"Amroha","Utter Pradesh","India");
          Student obj=new Student(123,"Imran malik",ad);
          System.out.println(obj.rollnum);
          System.out.println(obj.studentName);
          System.out.println(obj.studentAddr.streetNum);
          System.out.println(obj.studentAddr.city);
          System.out.println(obj.studentAddr.state);
          System.out.println(obj.studentAddr.country);  
    }
}