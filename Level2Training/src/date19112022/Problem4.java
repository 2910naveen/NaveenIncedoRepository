package date19112022;

//Lambda expressions are mainly useful in java to implement Functional interfaces that is interfaces with only 
//one abstract method.

interface FunctionalInterface
{
	void implementFunctionalInterface();
}

public class Problem4
{
	public static void main(String args[])
	{
		FunctionalInterface f = 
		//Lambda Expression
		()->{
			   System.out.println("The functional interface is implemented");
		    };
		f.implementFunctionalInterface();
	}

}
