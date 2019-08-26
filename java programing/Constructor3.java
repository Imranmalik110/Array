import java.lang.String;
import java.util.Scanner;
class Constructor3
{
    public Constructor3()
    {
        this("IslamicHD.Photo.Com");
    }
    class Constructor3(String s)
    {
        this(s,6);
    }
    Constructor3(String s,int age)
    {
        this.name=s;
        this.age=age;
    }
    public static void main(String args[])
    {
        Constructor3 obj=new Constructor3();
    }
}