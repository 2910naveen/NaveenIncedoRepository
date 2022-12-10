package date15112022;

public class DeprecatedClass 
{
	void m()
	{
		System.out.println("hello m");
	}
	
	@Deprecated
	void n()
	{
		System.out.println("hello n");
	}
    public static void main(String args[])
    {
    	DeprecatedClass d = new DeprecatedClass();
    	d.n();
    }
}
