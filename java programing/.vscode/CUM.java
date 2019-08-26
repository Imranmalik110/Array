package letmecalculate;
//  import java.lang.*;
 //   import java.util.Scanner;
class Base
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class CUM
{
    public static void main(String[] args) {
        Base obj=new Base();
        System.out.println(obj.add(12,45));
    }
}
