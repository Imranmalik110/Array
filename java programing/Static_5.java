import  java.lang.String;
import java.util.Scanner;
class Static 
{
    static String my_str="Khan Shahab";
}
class Static_5
{
    public static void main(String[] args) {
        Static obj=new Static();
        System.out.println(obj.my_str);
    }
}