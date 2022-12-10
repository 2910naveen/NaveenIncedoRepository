package date16112022;

public class Problem10 
{
	public static <T> T genericMethod(T value)
	{
		System.out.println(value);
		return value;
	}
	public static void main(String args[])
	{
		int i = genericMethod(10);
		char c = genericMethod('t');
		String s = genericMethod("naveen");
		System.out.println(i+" "+c+" "+s);
	}

}
