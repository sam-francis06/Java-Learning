import java.util.Scanner;
class Q3{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 1; i<=10;i=i+1)
        {
            
            System.out.println(i+" x "+ a +" = " + i* a);
        }
    }
}