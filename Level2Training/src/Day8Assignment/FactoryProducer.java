package Day8Assignment;

public class FactoryProducer implements AbstractFactory{

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		Shape s = new FactoryProducer();
		return s;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Factory Producer draw Method");
		
	}

}
