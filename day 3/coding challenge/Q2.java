import java.util.Scanner;
class Q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int subject1 = scan.nextInt();
        int subject2 = scan.nextInt();
        int subject3 = scan.nextInt();
        int subject4 = scan.nextInt();
        int subject5 = scan.nextInt();
        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println(total);
        double average = total/ 5;
        System.out.println(average);
        if(average < 35)
        {
            System.out.println("Additional Class is required");
        }
        else{
            System.out.println("You are good to go");
        }
    }
}