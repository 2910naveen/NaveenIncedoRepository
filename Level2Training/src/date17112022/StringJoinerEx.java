package date17112022;

import java.util.StringJoiner;
public class StringJoinerEx{
	public static void main(String args[])
	{
		StringJoiner joinNames = new StringJoiner(",");
		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("Ruby");
		System.out.println(joinNames);
	}

}
