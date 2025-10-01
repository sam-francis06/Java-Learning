class nestedif{
    public static void main (String arg[])
    {
        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = true;
        if(kfc)
        {
            System.out.println("Entering into KFC");
            if(chicken)
            {
                System.out.println("Eating Chicken");
                if(pepsi)
                {
                    System.out.println("Drinking Pepsi");
                }
            }
        }
    }
}