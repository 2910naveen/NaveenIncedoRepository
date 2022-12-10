package date16112022;

class CheckArgumentException extends Exception{
	
}
public class Problem5 {
	public static void main(String args[])
	{
		try
		{
			if(args.length<5)
			{
				throw new CheckArgumentException();
			}
			else
			{
				int num =0;
				for(int i=0;i<5;i++)
				{
					 num = Integer.parseInt(args[i]) + num;	
				}
				System.out.println(num);
			}
		}
		catch(CheckArgumentException e)
		{
			System.out.println("Passed arguments are less than 5");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Inside General exception");
			e.printStackTrace();
		}
		
	}

}
