import java.lang.String;
import java.util.Scanner;
public class Constructor
{
    String name;
    Constructor()
    {
        //this.name="MiaKhalifaHD.com";
        this.name="Shbita Bhabhi.com";
    }
    public static void main(String args[])
    {
        Constructor obj=new Constructor();
        System.out.println(obj.name);
    }
}