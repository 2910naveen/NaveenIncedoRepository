package date15112022;


abstract class ParentClass{
	abstract void displayInfo();
	
}
class SubClass  extends ParentClass{

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Overriding subclass");
		
	}
}
public class Annotations {
	public static void main(String args[])
	{
		SubClass s = new SubClass();
		s.displayInfo();
	}

}
