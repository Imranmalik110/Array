import java.lang.String;
import java.util.Scanner;
class Exam
{
    public static void main(String args[])
    {
        int n=1,i,j;
        for(i=0;i<10;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.println(n+" "+"\t");
                n++;
            }
            System.out.println();
        }
    }
}