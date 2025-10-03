import java.util.Scanner;
class Q4{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("The Array size: ");
        int a = scan.nextInt();
        int[] num = new int[a];
        for(int i = 0; i<=a-1;i=i+1)
        {
            num[i] = scan.nextInt();
        }
        int middleIndex = a/2;
        System.out.println(num[middleIndex]);
    }
}