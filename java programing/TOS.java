import java.lang.String;
import java.util.Scanner;
class TOS 
{
    public static void main(String args[])
    {
        int i,j,row,col;
        System.out.println("Enter the Number of Row and col: ");
        Scanner obj=new Scanner(System.in);
        row=obj.nextInt();
        col=obj.nextInt();
        int mat[]=new int[row][col];
        System.out.println("Enter the Element: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        System.out.println("Matrix is: \n");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.println(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}