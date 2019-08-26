package letmecalculate;
import java.lang.*;
import java.util.Scanner;
public class cal{
   public int add(int a, int b){
	return a+b;
   }
class Base
{
   public static void main(String args[]){
	cal obj = new cal();
	System.out.println(obj.add(10, 20));
   }
}