package date16112022;

interface Sayable{  
    int add(int a,int b);  
  
}  

public class Program2 
{ 
	    public static void main(String[] args)
	    {  
	        Sayable s = (a,b)->(a+b);
	        System.out.println(s.add(1,2));
	        Sayable s2 = (int a, int b)->{
	        	return (a+b);
	        };
	        System.out.println(s2.add(10,20));
	
            
       }
}