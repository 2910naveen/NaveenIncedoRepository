package date16112022;
import java.util.Scanner;
class NonAlphabetException extends Exception{
	
}
public class Problem3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of characters need to input:");
		int n = sc.nextInt();
		int i=0;
		for( i=0;i<n;i++)
		{
			String s = sc.next();
			for(int j=0;j<s.length();j++)
			{
				try 
				{
					if((s.charAt(j) >= 97 && s.charAt(j) <= 122 )|| (s.charAt(j)>=65 && s.charAt(j)<=90))
					{
						continue;
					}
					else
					{
						throw new NonAlphabetException();
					}
				}
				catch(NonAlphabetException e)
				{
					System.out.println("Inside Non-Alphabetical Exception");
					e.printStackTrace();
				}
			}
		}
		if(i == n)
		{
			System.out.println("non alphabetical value is not entered");
		}
	}
}
