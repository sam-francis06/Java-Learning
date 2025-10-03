import java.util.Scanner;
class Q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("a:");
        int a = scan.nextInt();
        System.out.print("b:");
        int b = scan.nextInt();
        for(int i = a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}