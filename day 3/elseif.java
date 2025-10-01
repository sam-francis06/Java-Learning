import java.util.Scanner;
class elseif{
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        int score = scan.nextInt();
        if(score > 35 && score < 60)
        {
            System.out.println("Video game");
        }
        else if(score > 60 && score < 90 )
        {
            System.out.println("Iphone");
        }
        else if(score > 90){
            System.out.println("Mackbook Pro");
        }
        else{
            System.out.println("no reward");
        }
    }
}