package date16112022;

//java provides a new feature called method referrence in java8.method referrence is used to refer a method
//of functional interface.
//Method referrence is a compact and easy form of lambda expression
//each time when you are using lambda expressions to refer a method , we can replace our lambda expression with
//method referrence
//Runnable interface contains only one abstract method so we can use it as functional interface
public class MethodReferrencesEx1 
{
	public static void threadStatus()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		Thread t1 = new Thread(MethodReferrencesEx1::threadStatus);  //this is for creating reference for a static method
		t1.start();
	}

}

//Suppose if we are creating reference for a instance method , then new MethodReferencesEx1()::threadStatus
//we will create one anonymous object for creating reference for an instance method.
