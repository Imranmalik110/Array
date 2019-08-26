import java.lang.String;
import java.util.Scanner;
class Decimal_To_Binary
{
    public static void main(String args[])
    {
        int n,count=0,a;
        Scanner obj=new Scanner(System.in);
        String x=" ";
        System.out.println("Enter Any Decimal value: ");
        n=obj.nextInt();
        while(n>0)
        {
            a=n%2;
            if(a==1)
            {
                count++;
            }
            x=x+""+a;
            n=n/2;
            System.out.println("Binary Value: "+x);
            System.out.println("No of 1s: "+count);
        }
    }
}