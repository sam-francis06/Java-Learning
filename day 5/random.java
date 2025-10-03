import java.util.Random;
class random{
    public static void main(String args[])
    {
        Random rand = new Random();
        int num = 0;
        while(num!=1)
        {
            num = rand.nextInt(11);
            System.out.println(num);
        }
    }
}