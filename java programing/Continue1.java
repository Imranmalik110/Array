import java.lang.String;
import java.util.Scanner;
class Continue1
{
    public static void main(String[] args) {
        for (int j=0;j<6;j++) {
            if (j==4) {
                continue;
            }
            System.out.println(j+ " ");
        }
    }
}