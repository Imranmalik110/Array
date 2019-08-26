import java.util.Scanner;
import java.lang.String;
class FibWhile
{
    public static void main(String args[])
    {
        int count,n1=0,n2=1,n3,i=1;
        System.out.print("Enter the Number Which  you want to print the Fibnonoic Series:");
        Scanner input=new Scanner(System.in);
        count=input.nextInt();
        System.out.print("Fibnonoic Series is:");
        while(i<=count)
        {
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
    }
}