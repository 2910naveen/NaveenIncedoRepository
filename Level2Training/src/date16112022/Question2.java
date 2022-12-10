package date16112022;

public class Question2 
{
	@SuppressWarnings("unused")
	public void exceptionDemo2() 
	{
		int arr[] = new int[-5];
	}
	@SuppressWarnings("unused")
	public void exceptionDemo1()
	{
		try
		{
			this.exceptionDemo2();
		}
		catch(NegativeArraySizeException e)
		{
		    System.out.println("Inside exceptionDemo1 Negative Array Size Exception");
		    int i = 1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside exceptionDemo1 Arithmetic Exception");
		}
	}
	
	public static void main(String args[])
	{
		try 
		{
			Question2 q = new Question2();
			q.exceptionDemo1();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Inside Main thread Negative Array Size Exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Main thread Arithmetic Exception");
		}
	}
}
