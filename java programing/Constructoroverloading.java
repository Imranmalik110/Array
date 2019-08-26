import java.lang.String;
class Constructoroverloading
{
    String web;
    Constructoroverloading(String w)
    {
        web=w;
    }
    Constructoroverloading(Constructoroverloading je)
    {
        web=je.web;
    }
    void Display()
    {
        System.out.println("Website is: "+web);
    }
    public static void main(String args[])
    {
        Constructoroverloading obj=new Constructoroverloading("IslamicHD.Video.com");
        obj.Display();
    }
}