import java.util.Scanner;
import java.lang.String;
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Password: ");
        Scanner input=new Scanner(System.in);
        input.next();
        String s=input.toString();
        System.out.println(s);
    }
}