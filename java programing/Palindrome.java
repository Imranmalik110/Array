import java.util.Scanner;
import java.lang.String;
class Palindrome
{
    public static void main(String args[])
    {
        int n,m,a=0,x;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        n=s.nextInt();
        m=n;
        while(n>0)
        {
            x=n % 10;
            a=a*10+x;
            n=n/10;
        }
        if(a==m)
        {
            System.out.print("Given Number "+m+"  is Palindrome");
        }
        else
        {
            System.out.print("Given Number "+m+" is not Palindrome");
        }
    }
}