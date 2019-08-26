import java.lang.String;
import java.util.Scanner;
class Nest
{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=i;j<i;j++)
            {
                System.out.println("S");
            }
            System.out.println();
        }
    }
}