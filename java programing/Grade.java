import java.lang.String;
import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        int n,i;
        float sum=0,avg;
        int marks[]=new int[50];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        n=in.nextInt();
        System.out.println("Enter the Element: ");
        for(i=0;i<n;i++)
        {
            marks[i]=in.nextInt();
            sum=sum+marks[i];
        }
        avg=sum/n;
        if(avg>=80)
        {
            System.out.println("Grade is A");
        }
        else if(avg>=70)
        {
            System.out.println("Grade is B");
        }
        else if(avg>=50)
        {
            System.out.println("Grade is C");
        }
        else
        {
            System.out.println("Grade is D");
        }
    }
}