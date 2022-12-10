package date17112022;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodAnnotation{
	String methodType();
	int noOfArguments();
	String access();
}
public class Question3 
{
	@MethodAnnotation(methodType="static",noOfArguments=2,access="public")
	public static void methodCheckAnnotation1(int p1,int p2)
	{
		 System.out.println("inside methodCheckAnnotation1");
	}
	
	@MethodAnnotation(methodType="instance",noOfArguments=3,access="public")
    public void methodCheckAnnotation2(int p1,int p2,int p3)
	{
		 System.out.println("inside methodCheckAnnotation2");
	}
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException
	{
		Question3 q = new Question3();
		Method m1 = q.getClass().getMethod("methodCheckAnnotation1",int.class,int.class);
		System.out.println(m1.getAnnotation(MethodAnnotation.class).methodType());
		System.out.println(m1.getAnnotation(MethodAnnotation.class).noOfArguments());
		System.out.println(m1.getAnnotation(MethodAnnotation.class).access());
		Method m2 = q.getClass().getMethod("methodCheckAnnotation2",int.class,int.class,int.class);
		System.out.println(m2.getAnnotation(MethodAnnotation.class).methodType());
		System.out.println(m2.getAnnotation(MethodAnnotation.class).noOfArguments());
		System.out.println(m2.getAnnotation(MethodAnnotation.class).access());
		
	}
}
