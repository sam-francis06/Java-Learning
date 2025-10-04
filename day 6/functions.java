class functions{
    void greeting()
    {
        System.out.println("Hi Sam!");
        dummy();
    }
    void dummy()
    {
        System.out.println("Dummy");
    }
    public static void main(String args[])
    {
        functions obj1 = new functions();
        obj1.greeting();
    }
}