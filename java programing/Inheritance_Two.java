import java.lang.String;
import java.util.Scanner;
class Base
{
    String str;
    int marks[]=new int[3];
    Scanner input=new Scanner(System.in);
    void Get_data()
    {
        System.out.println("Enter the name of Student: ");
        str=input.nextInt();
        System.out.println("Enter The Marks of Three subject: ");
        for(i=0;i<3;i++)
        {
            marks[i]=input.nextInt();
        }
    }
    class Derived extends Base
    {
        void Display()
        {
            System.out.println("Name of the student is "+str);
            System.out.println("Marks is: ");
            for(i=0;i<3;i++)
            {
                System.err.println(marks[i]);
            }
            System.out.println();
        }
    }
    class Inheritance_Two
    {
        public static void main(String args[])
        {
            Derived obj=new Derived();
            obj.Get_data();
            obj.Display();
        }
    }

}