import java.util.Scanner;
public class Even
{
public static void main(String args[])
{
	int num;
	System.out.println("Enter the Integer value ");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	if(num%2==0)
	{
	System.out.println("This is even number");
	}
	else
	{
	System.out.println("This is odd Number");
	}
	}
}