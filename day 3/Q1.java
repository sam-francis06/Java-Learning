import java.util.Scanner;
class Q1{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a/3 == 0 && a/5 == 0)
        {
            System.out.println("Divisible by 3 and 5");
        }
        else{
            System.out.println("dont divisible by 3 and 5");
        }
    }

}