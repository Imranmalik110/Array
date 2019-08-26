import java.lang.String;
import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int count=7,num=0,num1=1,num2,i;
        System.out.println("Enter the value of count:");
        Scanner in=new Scanner(System.in);
        count=in.nextInt();         
        System.out.print("Enter the Fibnonoic Serious:");
        for(i=1;i<=count;++i)
        {
            System.out.print(num+" ");
            num2=num+num1;
            num=num1;
            num1=num2;
        }

    }
}