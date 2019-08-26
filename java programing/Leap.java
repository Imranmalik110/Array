import java.util.Scanner;
public class Leap
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the any number ");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		if((num%4==0)&&(num%100!=0)||(num%400==0))
		{
			System.out.println("This is Leap year");
		}
		else
		{
			System.out.println("This is not Leap year");
		}
	}
}