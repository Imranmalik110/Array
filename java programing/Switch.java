import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the Value of NUM");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("Sunday");
			break;
			case 2:
			System.out.println("Monday"); 
			break;
			default:
			System.out.println("Please Enter the Valid Choice");
		}
	}
}