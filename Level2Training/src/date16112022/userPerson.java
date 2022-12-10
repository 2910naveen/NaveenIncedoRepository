package date16112022;

import java.util.Scanner;

public class userPerson{
	Integer id;
	String name;
	String role;
	public userPerson(int id,String name,String role)
	{
		//AutoBoxing
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the details of user:");
			userPerson pi = new userPerson(sc.nextInt(),sc.next(),sc.next());
		
			//Auto-unBoxing
			int num = pi.id;
			String name = pi.name;
			String role = pi.role;
			System.out.println(num+" "+name+" "+role);
			sc.close();
		
		
	}

}
