package letmecalculate;
public class Calculater
{
    int add(int n1,int n2)
    {
        return n1+n2;
    }
    public static void main(String[] args) {
        Calculater obj=new Calculater();
        System.out.println(obj.add(12,45));
    }
}