//Get input for Variable Mark. If mark > 35 print pass. Else Print fail.
import java.util.Scanner;
class Q1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark > 34)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}