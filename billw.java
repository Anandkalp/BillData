class bill4
{
public static void main(String args[])	
	{
		int muttonBiryani =260;
		int chickenBiryani =220;
		int thumbsup =110;
		int total =0;
		double sum =0;

		total= muttonBiryani+chickenBiryani+thumbsup;
		sum= (0.05 * total) + total;

		System.out.println("Total : "+total);
		System.out.println("Total Bill : "+sum);
	}
}
