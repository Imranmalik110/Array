import java.lang.String;
import java.util.Scanner;
class Interchange
{
    public static void main(String args[])
    {
        int a,b,t;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The value of A and B:");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Value before Swaping: "+a+" and "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("Value of After Swaping: ");
        System.out.println("Value of "+a+" and "+b);
    }
}