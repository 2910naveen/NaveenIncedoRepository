package date30112022;

class InterestRate{
	private static volatile InterestRate iRate = new InterestRate();
	private InterestRate()
	{
		
	}
	public static InterestRate getInterestRate()
	{
		return iRate;
	}
}

public class Deposit 
{
	public static void main(String args[])
	{
		InterestRate interestR = InterestRate.getInterestRate();
		System.out.println("1st Instance"+interestR);
		InterestRate interestR2 = InterestRate.getInterestRate();
		System.out.println("2nd Instance"+interestR2);
	}

}
