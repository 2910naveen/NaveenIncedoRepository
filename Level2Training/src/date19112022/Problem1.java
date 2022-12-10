package date19112022;

interface ImplementAnonymousClass{
	void show();
}
public class Problem1 
{
	public static void main(String args[])
	{
		ImplementAnonymousClass i = new ImplementAnonymousClass(){
			public void show()
			{
				System.out.println("Inside Anonymous class show method");
			}
		};
		i.show();
	}

}
