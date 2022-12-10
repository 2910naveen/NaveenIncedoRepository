package abstractFactoryDesignPattern;

public class AbstractFactoryDesignPatternDemo
{
	public static void main(String args[])
	{
		FactoryProvider f = new FactoryProvider();
		AbstractFactory shape = f.getfactoryfromProvider("shape");
		Shape rect = shape.getShape("Rectangle");
		rect.draw();
		Shape squ = shape.getShape("square");
		squ.draw();
		Shape cir = shape.getShape("circle");
		cir.draw();
		AbstractFactory color = f.getfactoryfromProvider("color");
		Color red = color.getColor("red");
		red.fill();
		Color green = color.getColor("green");
		green.fill();
		Color blue = color.getColor("blue");
		blue.fill();
	}

}
