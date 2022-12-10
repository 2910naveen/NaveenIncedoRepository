package date16112022;

import java.util.Scanner;
abstract class Shape{
	abstract void area();
	abstract void show();
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println(this.length*this.breadth);
		
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("inside Rectangle");
		
	}
	
	
}
class Triangle extends Shape
{
	int base;
	int height;
	public Triangle(int base,int height)
	{
		this.base = base;
		this.height = height;
	}
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println(0.5*this.base*this.height);
		
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("inside Triangle");
		
	}
	
	
}

public class Problem6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle(sc.nextInt(),sc.nextInt());
		Triangle t = new Triangle(sc.nextInt(),sc.nextInt());
		r.area();
		r.show();
		t.area();
		t.show();
		
	}

}
