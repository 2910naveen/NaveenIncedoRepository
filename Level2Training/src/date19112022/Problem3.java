package date19112022;

interface ReferrenceInterface{
	void show1();
	void show2();
}
public class Problem3 implements ReferrenceInterface 
{
	@Override
	public void show1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Inside Show1 method of class");
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("Inside Show2 method of class");
		
	}
	
    public static void main(String args[])
    {
    	//Here r is Referrence of ReferrenceInterface we are creating to Problem3Class Object.
    	ReferrenceInterface r = new Problem3();
    	r.show1();
    	r.show2();
    	
    }

	
}
