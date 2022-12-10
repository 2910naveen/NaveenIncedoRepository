package date16112022;

interface Test{
	void test1();
}
public class MethodReferrence {
	public static void testAnything()
	{
		System.out.println("Hello,this is static method");
	}
	public static void main(String args[])
	{
		Test Test = MethodReferrence::testAnything;
		Test.test1();
		
	}

}
