import java.util.Scanner;
public class Fact
{
	public static void main(String args[])
	{
		int num,i,fact=1;
		i=num;
		System.out.println("Enter the Num Value");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("The Factorial of given number="+num+fact);
	}
}