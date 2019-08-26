import java.lang.String;
import java.util.Scanner;
class Insert_Array
{
    public static void main(String args[])
    {
        int insert,i,pos,size;
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[50];
        System.out.println("Enter the Size of Array: ");
        size=obj.nextInt();
        System.out.println("Enter the "+size+" element in Array: ");
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the Element to be Searched: ");
        insert=obj.nextInt();
        System.out.println("Enter the Position to be Insert: ");
        pos=obj.nextInt();
        fo(i=size;i>pos;i--)       
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=insert;
        System.out.println("Inserted Succuessfully\n");
        for(i=0;i<size-1;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}