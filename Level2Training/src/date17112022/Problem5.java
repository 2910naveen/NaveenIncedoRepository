package date17112022;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1
{
	String name();
	String type();
}

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2
{
	int value();
	int noOfArguments();
	
}
public class Problem5 
{
	@MyAnnotation1(name="implementMultipleAnnotations",type="instance")
	@MyAnnotation2(value=19,noOfArguments=3)
	public void implementMultipleAnnotations(int p1,int p2,int p3)
	{
		System.out.println("Inside implementMultipleAnnotations method");
		System.out.println("sum of arguments is "+(p1+p2+p3));
	}
	public static void main(String args[]) throws NoSuchMethodException, SecurityException
	{
	   Problem5 p = new Problem5();
	   p.implementMultipleAnnotations(3,6,10);
	   String name=p.getClass().getMethod("implementMultipleAnnotations",int.class,int.class,int.class).getAnnotation(MyAnnotation1.class).name();
	   String type=p.getClass().getMethod("implementMultipleAnnotations",int.class,int.class,int.class).getAnnotation(MyAnnotation1.class).type();
	   int value = p.getClass().getMethod("implementMultipleAnnotations",int.class,int.class,int.class).getAnnotation(MyAnnotation2.class).value();
	   int noOfArguments = p.getClass().getMethod("implementMultipleAnnotations",int.class,int.class,int.class).getAnnotation(MyAnnotation2.class).noOfArguments();
	   System.out.println("MyAnnotation1 Name: "+name);
	   System.out.println("MyAnnotation1 Type: "+type);
	   System.out.println("MyAnnotation2 Value: "+value);
	   System.out.println("MyAnnotation2 noOfArguments: "+noOfArguments);
	   
	   
	}

}
