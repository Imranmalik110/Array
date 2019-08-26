import java.lang.String;
import java.util.Scanner;
class Insertion_sort
{
    public static void main(String args[])
    {
        int i,j,size,temp;
        int arr[]=new int[50];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        size=obj.nextInt();
        System.out.println("Enter "+size+ "Element in Array: ");
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Array after Insertion Sort techinque use: ");
        for(i=1;i<size-1;i++)
        {
            temp=arr[i];
            j=i-1;
            while((temp<arr[j])&&(j>=0))
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.println("Array after Sorting: ");
        for(i=1;i<size-1;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}