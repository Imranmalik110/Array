package letmecalculate;
import java.lang.String;
import java.util.Scanner;
public class calculate {
   public int add(int a, int b){
	return a+b;
   }
   public static void main(String args[]){
	calculate obj = new calculate();
	System.out.println(obj.add(10, 20));
   }
}