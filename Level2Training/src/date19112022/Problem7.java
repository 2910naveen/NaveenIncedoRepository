package date19112022;

interface MethodReferrence{
	void show();
}
public class Problem7 
{
	public static void methodReferrence1()
	{
		System.out.println("Method static referrence");
	}
	public void methodReferrence2()
	{
		System.out.println("Method instance referrence");
	}
	public static void main(String args[])
	{
		//static method referrence 
		MethodReferrence m = Problem7::methodReferrence1;
		m.show();
		//instance method referrence
		MethodReferrence m1 = new Problem7()::methodReferrence2;
		m1.show();
	}

}
