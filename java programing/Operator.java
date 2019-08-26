import java.lang.String;
import java.util.Scanner;
class Operator
{
    public static void main(String args[])
    {
        int x;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of X: ");
        x=obj.nextInt();
        --x;
        System.out.println("Result is: "+x);
    }
}