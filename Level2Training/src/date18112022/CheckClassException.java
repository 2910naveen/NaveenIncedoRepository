package date18112022;

class LowBalanceException extends Exception{
	public static void main(String args[])
	{
		System.out.println("WithDraw Amount(_Rs) is Not Valid ");
	}
}
class Account
{
	static int min_balance = 500;
	int balance;
	public Account()
	{
		
	}
	public Account(int balance)
	{
		this.balance = balance;
	}
	public int depositAmount(int amount) throws LowBalanceException
	{
		this.balance = this.balance + amount;
		return this.balance;
	}
	public int withDrawAmount(int amount) throws LowBalanceException
	{
		if(this.balance < amount)
		{
			throw new LowBalanceException();
		}
		this.balance = this.balance - amount;
		return this.balance;
	}
}

public class CheckClassException 
{
	public static void main(String args[])
	{
		try {
			Account a1 = new Account(500);
			Account a2 = new Account(500);
			System.out.println(a1.depositAmount(200));
			System.out.println(a2.depositAmount(300));
			System.out.println(a1.withDrawAmount(100));
			System.out.println(a2.withDrawAmount(1000));
		}
		catch(LowBalanceException l)
		{
			System.out.println("WithDraw Amount(_Rs) is Not Valid ");
			l.printStackTrace();
		}
		
		
	}

}
