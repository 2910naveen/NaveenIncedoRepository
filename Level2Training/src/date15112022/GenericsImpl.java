package date15112022;

public class GenericsImpl<G> {
	
	private G g;
	public void add(G g)
	{
		this.g = g;
	}
	public G get()
	{
		return g;
	}
	public static void main(String args[])
	{
		GenericsImpl<Integer> intgenerics = new GenericsImpl<>();
		GenericsImpl<Character> chargenerics = new GenericsImpl<>();
		intgenerics.add(20);
		chargenerics.add('f');
		System.out.printf("Integer Value :%d\n\n",intgenerics.get());
		System.out.printf("Character Value :%s\n\n",chargenerics.get());
	}

}
