import java.lang.String;
import java.util.Scanner;
class LinearSearch
{
    public static void main(String args[])
    {
        int n,i,num,c=0,pos=0;
        int a[]=new int[50];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the  Size of Array: ");
        n=in.nextInt();
        System.out.println("Enter Element in Array: ");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the Search Element: ");
        num=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                c=1;
                pos=i+1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Number not Found:!!!");
        }
        else
        {
            System.out.println(num+ "Found at position "+pos);
        }
    }
}