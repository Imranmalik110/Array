import java.lang.String;
import java.util.Scanner;
class IntObj
{
    public int value;
}
public class Pointer
{
    public static void main(String args[])
    {
        int num1,num2,sum=0;
        IntObj ptr1;
        IntObj ptr2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of Two integer:");
        num1=in.nextInt();
        num2=in.nextInt();
        ptr1=new IntObj();
        ptr2=new IntObj();
        ptr1.value=num1;
        ptr2.value=num2;
        sum=ptr1.value+ptr2.value;
        System.out.println("Sum of Two integer is "+sum);
    }
}