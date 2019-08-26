import java.lang.String;
import java.util.Scanner;
class BinarySearch
{
    public static void main(String args[])
    {
        int Search,i,first,middle,last,n;
        int arr[]=new int[50];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        n=in.nextInt();
        System.out.println("Enter the Element in Array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the Element to be Search: ");
        Search=in.nextInt();
        first=0;
        last=n-1;
        middle=first+last/2;
        while(first<=last)
        {
            if(arr[middle]<Search)
            {
                first=middle+1;
            }
            else if(arr[middle]==Search)
            {
                System.out.println(Search+ "found at Location "+middle);
                break;
            }
            else
            {
                last=middle-1;
            }
            middle=first+last/2;
        }
        if(first>last)
        {
            System.out.println("Element is not present in List");
        }
    }
}