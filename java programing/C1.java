import java.lang.String;
import java.util.Scanner;
class Bike
{
    int Bike_Id;
    String Bike_name;
    Bike(int id,String name)
    {
        Bike_Id=id;
        Bike_name=name;
    }
    void Show()
    {
        System.out.println("Bike_ID "+ Bike_Id + "Bike_Name "+Bike_name);
    }
}
class C1
{
    public static void main(String[] args) {
        Bike obj = new Bike(11,"Ninja Model 110");
        obj.Show();
    }
}