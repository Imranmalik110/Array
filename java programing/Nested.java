import java.util.Scanner;
class Nested
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the The marks");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		if(num>=80)
		{
			System.out.println("A Grade");
		}
		else if(num>=60)
		{
			System.out.println("B Grade");
		}
		else
		{	
			System.out.println("C Grade");
		}
	}
}