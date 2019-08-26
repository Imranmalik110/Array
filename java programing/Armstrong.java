import java.lang.String;
import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        int n,nu,num=0,rem;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Any Positive Number: ");
        n=obj.nextInt();
        nu=n;
        while(nu!=0)
        {
            rem=nu%10;
            num=num+rem*rem*rem;
            nu=nu/10;
        }
        if(num==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an ArmStrong");
        }
    }
}