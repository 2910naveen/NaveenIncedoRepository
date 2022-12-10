package date15112022;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
}

class Hello{
	@MyAnnotation(value=50)
	public void sayHello()
	{
		System.out.println("Hello java annotation");
	}
}
public class MyAnnotationImpl {
	public static void main(String args[])
	{
		Hello hello = new Hello();
		//Class class = hello.getClass();
		try {
			Method methodObj = hello.getClass().getMethod("sayHello");
			MyAnnotation annotation = methodObj.getAnnotation(MyAnnotation.class);
			System.out.println("Value is "+ annotation.value());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
