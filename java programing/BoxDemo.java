import java.lang.String;
import java.util.Scanner;
class Box
{
    double width;
    double height;
    double depth;
    Box(double wid,double hei,double dep)
    {
        System.out.println("Constructed Box ");
        width=wid;
        height=hei;
        depth=dep;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class BoxDemo
{
    public static void main(String args[])
    {
        Box obj=new Box(12.4,56.2,3.3);
        double vol;
        vol=obj.volume();
        System.out.println("Volume of First Box is: "+vol);
    }
}