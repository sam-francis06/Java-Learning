 import java.util.Scanner;
 class Q1{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i = 0; i<= 4; i = i+1)
        {
            marks[i] = scan.nextInt();
        }
        for(int i = 0; i<=4; i=i+1)
        {
            System.out.println(marks[i]);
        }

    }
 }