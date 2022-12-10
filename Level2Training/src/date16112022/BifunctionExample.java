package date16112022;
import java.util.function.*;
class Arithmetic{
	public static int add(int a,int b)
	{
		return a+b;
	}
}
public class BifunctionExample {
	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer> adder = Arithmetic::add;
		int result = adder.apply(1,2);
		System.out.println(result);
		
		BiFunction<Integer,Integer,Integer> lambdabi = (a,b)->(a*b);
		int result1 = lambdabi.apply(10, 20);
		System.out.println(result1);
		
		Function<Integer,Integer>lambdaThen = (resultFromBi)->resultFromBi*3;
		int result2 = lambdabi.andThen(lambdaThen).apply(10,20);
		System.out.println(result2);
		
		
	}

}
