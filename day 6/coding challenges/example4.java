class example4{

    void sum(int num1, int num2)
    {
        System.out.println(num1 + num2);

    }
    void sub(int num1, int num2)
    {
        System.out.println(num1 - num2);

    }
    void mul(int num1, int num2)
    {
        System.out.println(num1 * num2);

    }
    void div(int num1, int num2)
    {
        System.out.println(num1 / num2);

    }
    public static void main(String args[])
    {
        example4 obj = new example4();
        obj.sum(10,2);
        obj.sub(10,2);
        obj.mul(10,2);
        obj.div(10,2);
    }
}