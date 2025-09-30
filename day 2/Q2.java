import java.util.Scanner;
class Q2{
    public static void main (String args[])
    {
    Scanner value = new Scanner(System.in);
    int a = value.nextInt();
    int b = value.nextInt();
    int c = value.nextInt();
    int d = a * b * c;
    int e = a + b + c;
    System.out.println("the final answer is " + d / e);
    }
}