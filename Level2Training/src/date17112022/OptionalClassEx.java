package date17112022;
import java.util.*;
public class OptionalClassEx {
	public static void main(String args[])
	{
		Optional<String> optional = Optional.of("check");
		optional.isPresent();
		optional.get();
		optional.orElse("fallback");
		optional.ifPresent((s)->System.out.println(s.charAt(0)));
	}
}
