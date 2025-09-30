import java.util.Scanner;
class Q4{
    public static void main (String args[])
    {
        Scanner value = new Scanner(System.in);
        String name = value.nextLine();
        double score = value.nextInt();
        value.nextLine();
        String department = value.nextLine();
        System.out.println("My name is " + name );
        System.out.println("My Score is " + score/10 +"/10" );
        System.out.println("My Department is " + department);
    }
}