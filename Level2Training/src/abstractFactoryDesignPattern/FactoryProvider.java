package abstractFactoryDesignPattern;

public class FactoryProvider 
{
	public AbstractFactory getfactoryfromProvider(String factoryname)
	{
		if(factoryname.equalsIgnoreCase("SHAPE"))
		{
			return new ShapeFactory();
		}
		else if(factoryname.equalsIgnoreCase("COLOR"))
		{
			return new ColorFactory();
		}
		else
		{
			return null;
		}
	}
}
