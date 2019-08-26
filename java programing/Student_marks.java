import java.lang.String;
import java.util.Scanner;
class Student_marks
{
    public static void main(String args[])
    {
        int n,i,total=0,percantage;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number of Student:");
        n=obj.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter "+n+" Marks of Student:");
        for(i=0;i<n;i++)
        {
            marks[i]=obj.nextInt();
            total=total+marks[i];
        }
        percantage=total/n;
        System.out.println("Sum of "+n+" Student is: "+total);
        System.out.println("Percantage of: "+n+" Student is:"+percantage);
    }
}