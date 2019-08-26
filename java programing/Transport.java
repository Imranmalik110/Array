import java.lang.String;
import java.util.Scanner;
class Car
{
    String carname;
    int id;
    Car(String name,int identity)
    {
        this.carname=name;
        this.id=identity;
    }
}
class Driver extends Car
{
    String drivername;
    Driver(String name,String cname,int cid)
    {
        super(cname,cid);
        this.drivername=name;
    }
}
class Transport
{
    public static void main(String[] args) {
        Driver obj=new Driver("Imran","Ford",1998);
        System.out.println(obj.drivername+" is a driver id:"+obj.id);
    }
}