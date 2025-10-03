import java.util.Scanner;
class Q1{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("The Salary:");
        int salary = scan.nextInt();
        System.out.println("The Age:");
        int age = scan.nextInt();
        if(salary >= 20000 || age <= 25)
        {
            System.out.println("you are eligible for loan");
            System.out.println("The Loan required amount:");
            int loan = scan.nextInt();
            if(loan <= 50000) 
            {
                System.out.println("Loan Available");
            }
            else(loan > 50000)
            {
                System.out.println("the maximum loan amount is 50000");
            }
        }
        else
        {
            System.out.println("Your are not Eligible");

        }
    }
}