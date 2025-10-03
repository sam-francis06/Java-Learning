class Q5{
    public static void main(String args[])
    {
        int count = 0;
        for(int i=1;i<=10;i=i+1)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("the no. of ODD numbers: "+count);
    }
}