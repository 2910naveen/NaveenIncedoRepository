package Day8Assignment;

public class AbstractFactoryPatternDemo
{
	public static void main(String args[])
	{
		FactoryProducer f = new FactoryProducer();
		f.draw();
		Shape s = f.getShape();
		System.out.println(s);
		
	}

}
