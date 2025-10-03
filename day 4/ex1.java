import java.util.Scanner;
class ex1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String result = a>b?"the a is greater than b":"the b is greater than a";
        System.out.println(result);
    }
}