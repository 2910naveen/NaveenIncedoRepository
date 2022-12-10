package date18112022;

import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception{
	
}
public class CheckCapital 
{
	public static void main(String args[])
	{
		Map<String,String> map = new HashMap<>();
		map.put("india","Delhi");
		map.put("australia","Sydney");
		map.put("america","Washington");
		map.put("england","London");
		try 
		{
			String check = map.get(args[0].toLowerCase());
			if(check == null)
			{
				throw new NoMatchFoundException();
			}
			else
			{
				System.out.println(check);
			}
		}
		catch(NoMatchFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
