import java.lang.String;
import java.util.Scanner;
class SumDemo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the No of Terms:");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Entered The Array Element:");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
        }       
        System.out.println("Sum:"+sum);
    }
}