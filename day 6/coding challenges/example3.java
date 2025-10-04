class example3{
    int apple_price = 20;
    int apple_count = 5;
    void total_money()
    {
        System.out.println(apple_price*apple_count);
    }
    public static void main(String args[])
    {
        example3 obj = new example3();
        obj.total_money();
    }
}