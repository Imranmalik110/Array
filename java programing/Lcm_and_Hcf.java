import java.lang.String;
import java.util.Scanner;
class Lcm_and_Hcf
{
    public static void main(String args[])
    {
        int a,b,x,y,t,hcf,lcm;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        x=obj.nextInt();
        y=obj.nextInt();
        a=x;
        b=y;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        hcf=a;
        lcm=(x*y)/hcf;
        System.out.println("HCF= "+hcf);
        System.out.println("LCM= "+lcm);
    }
}