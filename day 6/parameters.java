class parameters{
    void getsoap(int money)
    {
        System.out.println(money);
        System.out.println("Soap purchased");
    }
    void chocolate(int money)
    {
        System.out.println(money);
        System.out.println("chocolate purchased");
    }
    public static void main(String args[])
    {
        parameters obj = new parameters();
        obj.getsoap(10);
        obj.chocolate(5);

    }
}