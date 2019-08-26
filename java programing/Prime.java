import java.util.Scanner;
import java.lang.String;
class Prime
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int i=0,num=0,n,counter=0;
        String PrimeNumber=" ";
        System.out.println("Enter the value of N: ");
        n=obj.nextInt();
       //Scanner.close();
        for(i=1;i<=n;i++)
        {
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
                {
                    counter=counter+1;
                }
            }
            if(counter==2)
            {
                PrimeNumber=PrimeNumber+i+" ";
            }
        }
        System.out.println("Prime number form 1 to N is:"+n);
        System.out.println(PrimeNumber);
    }
}