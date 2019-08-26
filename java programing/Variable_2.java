import java.lang.String;
import java.util.Scanner;
class Variable_2
{
    public static void main(String[] args) {
        int a;
        float b;
        String str;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Integer value: ");
        a=obj.nextInt();
        System.out.println(a);
        System.out.println("Enter String value: ");
        str=obj.nextLine();
        System.out.println(str);
        System.out.println("Enter a Float value: ");
        b=obj.nextFloat();
        System.out.println(b);
     /*   System.out.println(a);
        System.out.println(str);
        System.out.println(b);          */
    }
}