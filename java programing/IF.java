import java.util.Scanner;
class IF
{
public static void main(String args[])
{
	int pass,obatin;
	pass=40;
	Scanner input=new Scanner(System.in);
	System.out.println("Input marks scored by you");
	obatin=input.nextInt();
	if(obatin>=pass)
	{
	System.out.println("You are Passed");
	}
	else
	{
	System.out.println("Unfortunatle you are failed");
	}
}
}