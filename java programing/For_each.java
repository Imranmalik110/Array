import java.lang.String;
import java.util.Scanner;
class For_each
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i : arr)
        {
            System.out.println("The value of "+i);
            sum=sum+i;
        }
        System.out.println("Sum is= "+sum);
    }
}