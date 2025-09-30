import java.util.Scanner;
class Q2{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income > 7000)
        {
            System.out.println("Schoalership is available");
        }
        else{
            System.out.println("not eligible for scholarship");
        }
    }
}