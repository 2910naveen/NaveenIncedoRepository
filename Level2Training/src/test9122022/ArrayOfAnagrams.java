package test9122022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfAnagrams 
{
	public static ArrayList<ArrayList<String>> returnAnagram(String arr[])
	{
		ArrayList<ArrayList<String>> arr1 = new ArrayList<ArrayList<String>>();
		ArrayList<String> a1 = createStringArrayList();
    	a1.add(arr[0]);
    	ArrayList<String> a2 = createStringArrayList();
    	ArrayList<String> a3 = createStringArrayList();
    	boolean check = false;
    	for(int i=1;i<arr.length;i++)
    	{  
           String str = a1.get(0);
           char[] ca = str.toCharArray();
           Arrays.sort(ca);
           String str2 = arr[i];
           char[] ca2 = str2.toCharArray();
           Arrays.sort(ca2);
           if(String.valueOf(ca2).equals(String.valueOf(ca)))
           {
        	   check = true;
        	   a1.add(str2);
           }
           else if(a2.size() == 0)
           {
        	   check = true;
        	   a2.add(str2);
           }
           else if(a2.size() != 0)
           {
        	   String sa2 = a2.get(0);
        	   char arr2[] = sa2.toCharArray();
        	   Arrays.sort(arr2);
    	       if(String.valueOf(ca2).equals(String.valueOf(arr2)))
        	   {
    	    	   check = true;
        		   a2.add(str2);
        	   }
           }
           
           if(a3.size() == 0 && check == false)
           {
        	   a3.add(str2);
           }
           else if(a3.size() != 0 && check == false)
           {
        	   String sa3 = a3.get(0);
        	   char arr3[] = sa3.toCharArray();
        	   Arrays.sort(arr3);
        	   if(String.valueOf(ca2).equals(String.valueOf(arr3)))
        	   {
        		   a3.add(str2);
        	   }
        	   
           }
           
    	}
    	arr1.add(a1);
    	arr1.add(a2);
    	arr1.add(a3);
    	return arr1;
	}
	public static ArrayList<String> createStringArrayList()
	{
		return new ArrayList<String>();
	}
    public static void main(String args[])
    {
    	String arr[] = {"eat","tea","tan","ate","nat","bat"};
    	String arr2[] = {""};
    	String arr3[] = {"a"};
    	if(arr2.length == 1)
    	{
    		ArrayList<String> arrlist2 = new ArrayList<String>();
    		arrlist2.add(arr2[0]);
    		System.out.println(arrlist2);
    	}
    	
    	if(arr3.length == 1)
    	{
    		ArrayList<String> arrlist3 = new ArrayList<String>();
    		arrlist3.add(arr3[0]);
    		System.out.println(arrlist3);
    	}
    	ArrayList<ArrayList<String>> arr1 = returnAnagram(arr);
    	System.out.println(arr1);
    	
    	
    	
    	
    }
}
