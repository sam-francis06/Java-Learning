import java.util.Scanner;
class Q3{
    public static void main (String args[])
    {
        Scanner scan  = new Scanner(System.in);
        String color = scan.nextLine();
        if (color.equals("red"))
        {
            System.out.println("Stop");
        }
        else if(color.equals("yellow"))
        {
            System.out.println("Get Ready");
        }
        else if(color.equals("green"))
        {
            System.out.println("Go");
        }
    }
}