import java.lang.String;
import java.util.Scanner;
class ArMean
{
    public static void main(String args[])
    {
        int i,n,sum=0,armean;
        int arr[]=new int[50];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        n=in.nextInt();
        System.out.println("Enter the Element in Array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
        armean=sum/n;
        System.out.println("Arithmetic Mean is= "+armean);
    }
}