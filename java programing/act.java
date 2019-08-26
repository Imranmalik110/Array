import java.util.Scanner;
public class act
{
	public static void main(String args[])
	{
		int num,i,fact=1;
		System.out.println("Enter the Num Value");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		i=num;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("The Factorial of"+num+"is:"+fact);
	}
}