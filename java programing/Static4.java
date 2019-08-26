import java.lang.String;
import java.util.Scanner;
class Static4
{
    private staic String my_Str="START YOUR COMPUTER";
    staic class myNested
    {
        public void Display()
        {
            System.out.println(my_Str);
        }
    }
    public staic void main(String args[])
    {
        myNested obj=new myNested();
        obj.Display();
    }
}