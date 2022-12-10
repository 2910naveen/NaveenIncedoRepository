package date19112022;

import java.util.Scanner;
interface MultipleParameterLambdaImpl{
	void add(int a,int b,int c);
}
public class Problem6 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MultipleParameterLambdaImpl m = (a,b,c)->{
			System.out.println("The sum is "+(a+b+c));
		};
		System.out.println("Enter the numbers to get sum:");
		m.add(sc.nextInt(),sc.nextInt(),sc.nextInt());
		sc.close();

	}
	

}
