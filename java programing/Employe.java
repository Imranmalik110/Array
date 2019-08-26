import java.lang.String;
import java.util.Scanner;
class Employe
{
    int empId;
    String empname;
    Employe(int id,String name)
    {
        empId=id;
        empname=name;
    }
    void Display()
    {
        System.out.println("Id: "+empId+"  name:"+empname);
    }
    public static void main(String args[])
    {
        Employe obj1=new Employe(11,"Imaran malik");
        Employe obj2=new Employe(12,"Rihan malik");
        obj1.Display();
        obj2.Display();
    }
}