import java.lang.String;
import java.util.Scanner;
class MatAdd
{
    public static void main(String args[])
    {
        int m,n,c,d;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of Rows and Coloums: ");
        m=in.nextInt();
        n=in.nextInt();
        int first[][]=new int[m][n];
        int Second[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter the Element in First Matrix: ");
        for(c=0;c<m;c++)
        for(d=0;d<n;d++)
        first[c][d]=in.nextInt();
        System.out.println("Enter the Element in Second Matrix: ");
        for(c=0;c<m;c++)
        for(d=0;d<n;d++)
        Second[c][d]=in.nextInt();
        //System.out.println("Enter the Element in First Matrix: ");
        for(c=0;c<m;c++)
        for(d=0;d<n;d++)
        sum[c][d]=first[c][d]+Second[c][d];
        System.out.println("Sum of Two matrix is: ");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            System.out.println(sum[c][d]);
        }
    }
}