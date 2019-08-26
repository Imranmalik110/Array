import java.lang.String;
import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int num,i,tab;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num=obj.nextInt();
        System.out.println("Table of "+num+ " is:\n");
        for(i=1;i<=10;i++)
        {
            tab=num*i;
            System.out.println(num+"*"+i+"= "+tab+"\n");
        }
    }
}