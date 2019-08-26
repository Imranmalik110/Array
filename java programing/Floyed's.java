import java.lang.String;
import java.util.Scanner;
class Floyed'S 
{
    int range,i,j,k=1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the Range(UPto Value of: ");
    range=obj.nextInt();
    System.out.println("Floyed's Trangle: ");
    for(i=1;i<=range;i++)
    {
        for(j=1;j<=i;j++,k++)
        {
            System.out.println(k+ " ");
        }
        System.out.println();
    }
}