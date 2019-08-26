import java.util.Scanner;
public class PrintString
{
	public static void main(String args[])
	{
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your First name:");
		str=scan.nextLine();
		System.out.println("Hello, " +str);
	}
}