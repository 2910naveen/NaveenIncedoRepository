package date17112022;

import java.util.Optional;

public class Optional3 {
	public static void main(String args[])
	{
		String words[] = new String[10];
		words[0] = "Training";
		Optional<String> checknull = Optional.ofNullable(words[0]);
		if(checknull.isPresent())
		{
			String word = words[0].toLowerCase();
			System.out.println(word);
		}
		else
		{
			System.out.println("word is null");
		}
	}

}
