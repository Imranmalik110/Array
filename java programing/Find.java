import java.lang.String;
import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        int x,y,z;
        System.out.println("Enter the Three values ");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if((x>y)&&(x>z))
        {
            System.out.println("Greatest is A");
        }
        else if((y>x)&&(y>z))
        {
            System.out.println("Greatest is B");
        }
        else
        {
            System.out.println("Greatest is C");
        }
    }
}