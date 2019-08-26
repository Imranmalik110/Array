import java.util.Scanner;
class DO
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter the value of I");
		Scanner in=new Scanner(System.in);
		i=in.nextInt();
		do
		{
		System.out.println("Do While loop Execute is=" +i);
		if(i<=10)
		{
			break;
		}
		i++;
		System.out.println("Do While loop Execute is=" +i);
	}
}