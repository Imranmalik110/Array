import java.lang.String;
import java.util.Scanner;
class Note
{
    public static void main(String args[])
    {
        int i,j;
        int arr[]=new int[3][3];
        int arr[]=new int[3][3];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Element in Matrix 3*3: ");
        for (i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                    {
                        arr[i][j]=obj.nextInt();
                    }
            }
        System.out.println("Matrix is 3*3 is: ");
        for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                    {
                        System.out.println(arr[i][j]+"\t");
                    }
                System.out.println();
            }
        System.out.println("Transpose Array: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=arr[j][i];
            }
        }
        System.out.println("Final Transpose Matrix 3*3: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}