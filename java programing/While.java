import java.util.Scanner;
class While
{
	public static void main(String args[])
	{
		int num,i=1;
		long fact=1;
		System.out.println("Enter the Value which you want to calcualte the Factorial");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factoial of "+num+"is: "+fact);
	}
}