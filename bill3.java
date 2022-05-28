
class bill3
{
    public static void main(String args[])
    {
        int dosapindi=52;
	    int samosa=12;
	    int mixcy=29;
	    int total=0;
	    double finalbill=0;

		total= dosapindi+samosa+mixcy;
		finalbill= (0.10* total) + total;
		
		System.out.println("Total Bill: "+total);
		
		System.out.println("Final Bill: "+finalbill);
    }
}
	