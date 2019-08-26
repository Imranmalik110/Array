import java.lang.String;
import java.util.Scanner;
class Box
{
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    int show()
    {
        System.out.println("Value of Width: "+this.width);
        System.out.println("Value of Height: "+this.height);
        System.out.println("Value of Depth: "+this.depth);
        return width*height*depth;
        
    }
}
class This 
{
    public static void main(String args[])
    {
        Box obj=new Box(12,45,67);
        int vol;
        vol=obj.show();
        System.out.println("Result is: "+vol);
    }
}