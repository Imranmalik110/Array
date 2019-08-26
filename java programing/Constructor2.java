import java.lang.String;
import java.util.Scanner;
class Constructor2
{
    private int var;
    public Constructor2()
    {
        this.var=10;
    }
    public Constructor2(int num)
    {
        this.var=num;
    }
    public int getvalue()
    {
        return var;
    }
    public static void main(String args[])
    {
        Constructor2 obj=new Constructor2();
        Constructor2 obj1=new Constructor2(100);
        System.out.println("var is: "+obj.getvalue());
        System.out.println("var is: "+obj1.getvalue());
    }
}