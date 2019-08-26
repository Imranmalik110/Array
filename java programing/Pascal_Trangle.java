import java.lang.String;
import java.util.Scanner;
class Pascal_Trangle
{
    public static void main(String args[])
    {
        int r,i,k,j,number=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number of Row: ");
        r=obj.nextInt();
        for(i=0;i<r;i++)
        {
            for(k=r;k<i;k--)
            {
                System.out.println(" ");
            }
            number=1;
            for(j=0;j<=i;j++)
            {
                System.out.println(number+ " ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}