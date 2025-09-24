import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner variable = new Scanner(System.in);
        String Name = variable.nextLine();
        int Age = variable.nextInt();
        System.out.println("My Name is " + Name);
        System.out.println("My Age is " + Age);
    }
}