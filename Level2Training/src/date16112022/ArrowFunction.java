package date16112022;

@FunctionalInterface
interface TestLambda{
	void draw();
}
public class ArrowFunction {
	public static void main(String args[])
	{
		int width = 10;
		TestLambda d2 = ()->{
			System.out.println("Testing"+width);
			
		};
		d2.draw();
	}

}
