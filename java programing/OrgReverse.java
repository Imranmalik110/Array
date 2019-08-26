import java.lang.String;
import java.util.Scanner;
class OrgReverse
{
    public static void main(String args[])
    {
        int num,rev=0,rem;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number whihc you want to Print Reveser: ");
        num=input.nextInt();
       // orig=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number is: "+rev);
    /*    if(orig==rev)
        {
            System.out.println("Reverse is equal to the Orignal number");
        }
        else
        {
            System.out.println("Reverse is not equal to the Orignal number");
        }           */
    }
}