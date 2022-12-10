package date17112022;

//So the warnings issued by Oracle's Java compiler (as of Java 1.7) are: all, cast, classfile, deprecation,
//dep-ann, divzero, empty, fallthrough, finally, options, overrides, path, processing, rawtypes, serial, 
//static, try, unchecked, varargs.
import java.util.ArrayList;


class Addition {
	 
    // Method 1
    public static int sum(int n1, int n2)
    {
 
        // Return the final sum
        return n1 + n2;
    }
 
    // Method 2
    public static int sum(int... nums)
    {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
 
        // Return the final sum
        return sum;
    }
}

public class Problem1 
{
	@SuppressWarnings({"unchecked","rawtypes","unused"})
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		for(Object obj:list)
			System.out.println(obj);
		int i=0;
		Addition add = new Addition();
		int sum = Addition.sum(10,20);
		System.out.println(sum);
	}
	
}
