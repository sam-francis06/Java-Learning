import java.util.Scanner;
class userinput{
    public static void main(String args[])
    {
        Scanner john = new Scanner(System.in);
        int a = john.nextInt();
        int b = john.nextInt();
        System.out.println(a+b);
    }
}