import java.util.Scanner;

class ifelse{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean rain = scan.nextBoolean();
        if(rain)
        {
            System.out.println("Take an Umbrella");
        }
        else{
            System.out.println("Enjoy the Sunlight");
        }
    }
}