package date19112022;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Scanner;

interface MethodReferrence1{
	int square(int a);
}
public class Problem8 
{
	public static int show(int a)
	{
		System.out.println("Inside method referrence");
		System.out.println(a);
		return a*a;
	}
	
	public int squareClone(int a)
	{
		return a*a;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//Lambda function Implementation
		BiFunction<Integer,Integer,Integer> func1 = (a,b) -> (a+b);
		//Method Referrence Implementation
		Function<Integer,Integer> func2 = Problem8::show;
		MethodReferrence1 m = new Problem8()::squareClone;
		System.out.println("Enter the values of a and b");
		System.out.println(func1.andThen(func2).apply(sc.nextInt(),sc.nextInt()));
		sc.close();
		
		
	}

}
