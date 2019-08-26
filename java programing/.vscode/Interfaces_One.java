import java.lang.String;
import java.util.Scanner;
interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Interfaces_One implements A,B
{
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    }
}