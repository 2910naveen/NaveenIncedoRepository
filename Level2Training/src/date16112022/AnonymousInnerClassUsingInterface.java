package date16112022;

interface Eatable{
	void eat();
}
public class AnonymousInnerClassUsingInterface 
{
	public static void main(String args[])
	{
		Eatable e = new Eatable(){                   //creating the anonymous innerclass that implements
			public void eat()                        //Eatable interface
			{
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}

}
//Eatable p=new Eatable(){  
//void eat(){System.out.println("nice fruits");}  
//};  
//1.A class is created, but its name is decided by the compiler, which implements the Eatable 
//interface and provides the implementation of the eat() method.
//2.An object of the Anonymous class is created that is referred to by 'p', a reference 
//variable of the Eatable type.
//import java.io.PrintStream;  
//static class TestAnonymousInner1$1 implements Eatable  
//{  
//TestAnonymousInner1$1(){}  
//void eat(){System.out.println("nice fruits");}  
//}  