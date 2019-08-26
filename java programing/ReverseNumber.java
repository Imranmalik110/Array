import java.lang.String;
import java.uitl.Scanner;
class ReverseNumber
{
    public static void main(String args[])
    {
        int num,rev=0;
        System.out.println("Enter the Number which you want to Print the Reverse:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        while (num!=0)
        {
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println("Reverse of "+num+" is: "+rev);
    }
}