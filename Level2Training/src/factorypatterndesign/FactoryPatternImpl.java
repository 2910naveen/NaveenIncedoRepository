package factorypatterndesign;

public class FactoryPatternImpl  
{
	public static void main(String args[])
	{
		//FactoryPatternImpl f = new FactoryPatternImpl();
		OperatingSystemFactory o = new OperatingSystemFactory();
		OS s = o.getInstance("open");
		s.specs();
		OS a = o.getInstance("closed");
		a.specs();
		OS w = o.getInstance("naveen");
		w.specs();
	}

}
