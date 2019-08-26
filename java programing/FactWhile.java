import java.util.Scanner;
//import java.lang.String;
class FactWhile
{
    public static void main(String args[])
    {
        int i=1,num;
        double fact=1;
        System.out.println("Enter the Number which you  want to calculte the Factorial:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+" is:"+fact);
    }
}