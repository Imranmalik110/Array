import java.util.Scanner;
import java.lang.String;
class TrangleArea
{
    public static void main(String args[])
    {
        double height,base,area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Base of Trangle: ");
        base=input.nextDouble();
        System.out.println("Enter the Height of A Trangle:");
        height=input.nextDouble();
        area=(base+height)/2;
        System.out.println("Area of Trangle: "+area);
    }
}