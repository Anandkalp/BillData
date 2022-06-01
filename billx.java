class bill2
{
    public static void main(String args[])
    {
        int chickenbiryani=200;
        int thumbsup=50;
        int icecream=25;
        int total=0;
        double finalbill=0;

        total= chickenbiryani+thumbsup+icecream;
        finalbill=(0.05* total) + total;

        System.out.println("Total Bill: "+total);
   
        System.out.println("Final Bill: "+finalbill);
    }
}
