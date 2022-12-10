package date17112022;

//if a program element is annotated with deprecated then that element are discouraged to use.
//its not recommended to use those deprecated elements
public class Problem2 
{
	@Deprecated
	public void showDeprecated()
	{
		System.out.println("The method is deprecated and no longer in use");
	}
    public static void main(String args[])
    {
    	Problem2 p = new Problem2();
    	p.showDeprecated();
    }
}
