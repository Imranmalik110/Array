import java.lang.String;
import java.util.Scanner;
class Example1
{
    public static void main(String args[])
    {
        int arr[][][]=new int[3][4][2];
        int i,j,k,num=1;
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<2;k++)
                {
                    arr[i][j][k]=num;
                    num++;
                }
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<2;k++)
                {
                    System.out.println("arr["+i+ "][" +j+ "][" +k+ "]= "+arr[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}