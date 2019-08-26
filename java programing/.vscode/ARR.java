import java.lang.String;
import java.util.Scanner;
class ARR
{
    public static void main(String[] args) {
        int i,n;
        Scanner obj=new (System.in);
        System.out.println("Enter the Size of Array: ");
        n=obj.nextInt();
        int arr[10]=new arr[n];
        System.out.println("Enter the "+n+ " Element in Array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}