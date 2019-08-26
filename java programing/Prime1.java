import java.lang.String;
import java.util.Scanner;
clas Prime_Number
{
    public static void main(String args[])
    {
        int start,end,i,j,count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Range:\n");
        System.out.println("Enter the Starting Value:");
        start=obj.nextInt();
        System.out.println("Enter the Ending Value of number:");
        end=obj.nextInt();
        System.out.println("Prime Number between "+start+ " and "+end+" is:\n");
        for(i=start;i<=end;i++)
        {
            count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i+ " ");

            }
        }
    }
}