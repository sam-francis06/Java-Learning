import java.util.Scanner;
class example1{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        do
        {
            System.out.println("Enter the num > 10: ");
            num = scan.nextInt();
        }
        while(num < 10);
    }
}