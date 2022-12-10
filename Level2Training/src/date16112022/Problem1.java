package date16112022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//key words in exceptional handling are try,catch,finally,throws,throw
public class Problem1 {
	
	public void checkExceptions2() throws IOException,FileNotFoundException
	{
		System.out.println("Inside checkExceptions2 method");
		FileInputStream file = new FileInputStream("c:/users/segu.naveen/newfile.txt");
		file.close();
	}
	public void checkExceptions1() throws FileNotFoundException,IOException 
	{
		try
		{
			this.checkExceptions2();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Inside checkExceptions1");
			throw e;
		}
		
	}
	public static void main(String args[])
	{
		Problem1 p = new Problem1();
		try 
		{
			p.checkExceptions1();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Inside Main Thread File Not Found Exception");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("Inside Main Thread InputOutput Exception");
		}
		catch(Exception e)
		{
			System.out.println("Inside Main Thread General Exception");
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Inside main thread finally");
		}
	}

}
