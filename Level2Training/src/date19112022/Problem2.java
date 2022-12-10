package date19112022;

import java.util.*;
interface AnnonymousClassImplementation{
	void add(int a,int b);
	void multiply(int a,int b);
}
public class Problem2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		AnnonymousClassImplementation a = new AnnonymousClassImplementation(){
			public void add(int a,int b)
			{
				System.out.println("The Sum of numbers is "+(a+b));
			}
			public void multiply(int a,int b)
			{
				System.out.println("The product of numbers is "+(a*b));
			}
		};
		System.out.println("Enter the number inputs:");
		a.add(sc.nextInt(),sc.nextInt());
		a.multiply(sc.nextInt(),sc.nextInt());
		sc.close();
	}

}
