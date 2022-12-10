package date19112022;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Problem9 
{
	public static void main(String args[])
	{
		//creating an instance of Map 
		Map<Integer,String> m = new HashMap<>();
		
		//Adding values to the Map
		m.put(1,"Full Stack Developer");
		m.put(2,"Data Analyst");
		m.put(3,"Data Scientist");
		m.put(4,"Front End Developer");
		m.put(5,"Cloud Developer Engineer");
		
		//Collection.frequency to get number of occurrences
		BiFunction<Integer,String,String> f = (key,value)->"[key = "+key+",   value = "+value+" ("+Collections.frequency(m.values(),value)+")]";
		m.forEach((k,v)->System.out.println(f.apply(k, v)));
		
		
		
	}

}
