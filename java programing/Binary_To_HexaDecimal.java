import java.lang.String;
import java.util.Scanner;
class Binary_To_HexaDecimal
{
    public static void main(String args[])
    {
        int b_val,h_val=0,base=1,rem;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Binary Value In 0: ");
        b_val=obj.nextInt();
        while(b_val !=0)
        {
            rem=b_val%10;
            h_val=h_val+rem*base;
            base=base*2;
            b_val=b_val/2;
        }
    System.out.println("Its Hexadecimal Equalvalent value is: "+h_val);
    }
}