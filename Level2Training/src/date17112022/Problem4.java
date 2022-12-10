package date17112022;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyClassAnnotation{
	String name();
}

@MyClassAnnotation(name="Problem4")
public class Problem4 
{
	public static void main(String args[])
	{
		Problem4 p = new Problem4();
		MyClassAnnotation m= p.getClass().getAnnotation(MyClassAnnotation.class);
		System.out.println(m.name());
	}

}
