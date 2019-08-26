import java.lang.String;
import java.util.Scanner;
class Sum_of_n_Number
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number:");
        n=obj.nextInt();
        System.out.println("Enter "+n+" number:");
        for(i=0;i<n;i++)
        {
            n=obj.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum of all "+n+ " Numbers is: "+sum);
    }
}