import java.lang.String;
import java.util.Scanner;
class Calculater
{
    public static void main(String args[])
    {
        int a,b,res,choice;
        Scanner input=new Scanner(System.in);
        do
        {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            System.out.println("5.Exit");
            System.out.println("Enter the Choice:");
            choice=input.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter two number:");
                a=input.nextInt();
                b=input.nextInt();
                res=a+b;
                System.out.println("Result= "+res);
                break;
                case 2: System.out.println("Enter Two number: ");
                a=input.nextInt();
                b=input.nextInt();
                res=a-b;
                System.out.println("Result = "+res);
                break;
                case 3: System.out.println("Enter Two number:");
                a=input.nextInt();
                b=input.nextInt();
                res=a*b;
                System.out.println("Result= "+res);
                break;
                case 4: System.out.println("Enter Two number=");
                a=input.nextInt();
                b=input.nextInt();
                res=a/b;
                System.out.println("Result="+res);
                case 5: System.exit(0); break;
                default:
                System.out.println("Please Enter the Valid choice:");
            }
            System.out.println("\n----------\n");
        }while(choice!=5);
    }
}