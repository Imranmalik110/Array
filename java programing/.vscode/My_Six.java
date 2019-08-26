import java.lang.String;
import java.util.Scanner;
class My_Six
{
    final int max_value;
    My_Six(int rno)
    {
        max_value=rno;
    }
    void mymethod()
    {
      System.out.println(max_value);
    }
    public static void main(String[] args) {
        My_Six obj=new My_Six(12);
        obj.mymethod();
    }
}