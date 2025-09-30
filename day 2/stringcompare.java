class stringcompare{
    public static void main(String args[])
    {
        String f1 = "apple";
        String f2 = "apple";

        String a1 = new String("orange");
        String a2 = new String("orange");

        System.out.println(a1 == a2);
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}