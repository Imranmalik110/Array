import java.util.Scanner;
class Print
{
    public static void main(String args[])
    {
       String str;
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter Your first name: ");
       str=scan.nextLine();
       System.out.print("Hello"+ str);
    }
}