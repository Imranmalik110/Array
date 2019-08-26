import java.lang.String;
import java.util.Scanner;
class Main_one
{
    public static void main(String[] args) {
        int row,cols;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Row and cols: \n");
        row=obj.nextInt();
        cols=obj.nextInt();
        int array[][]=new array[row][cols];
        System.out.println("Enter the Element in Array: ");
        for(int i=0;i<row;i++)
            {
                for(int j=0;j<cols;j++)
                    {
                        array[i][j]=obj.nextInt();
                    }
            }
            System.out.println("Print array : ");
            for(int i=0;i<row;i++)
                {
                    for(int j=0;j<cols;j++)
                        {
                            System.out.println(array[i][j]);
  
                        }
                }
    }
}