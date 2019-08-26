import java.lang.String;
//import java.util.Scanner;   */
class ArraySum
{
    public static void main(String args[])
    {
        int a[]={12,56,24,89,43,67};
        int sum=0;
        for(int i : a)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Array element is:"+sum);
    }
}