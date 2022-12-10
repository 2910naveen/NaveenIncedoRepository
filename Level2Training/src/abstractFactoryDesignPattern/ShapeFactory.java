package abstractFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory
{

	@Override
	Shape getShape(String shape)
	{
		if(shape == null)
		{
			return null;
		}
		if(shape.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		else
		{
			return new Circle();
		}
		
		
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
