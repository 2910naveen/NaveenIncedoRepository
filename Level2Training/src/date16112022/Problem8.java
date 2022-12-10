package date16112022;

import java.util.Scanner;
enum Roles
{
	TRAINEE,
	SOFTWAREENGINEER,
	SENIORSOFTWAREENGINEER,
	MANAGER,
	HR,
	DIRECTOR,
	DELIVERYMANAGER
	
}
public class Problem8 
{
	
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Entered the role of the user:");
	   for(Roles r:Roles.values())
	   {
		   switch(r)
		   {
		      case TRAINEE:
			        System.out.println("The user role is Trainee");
			        break;
		      case SOFTWAREENGINEER:
			        System.out.println("The user role is Softwareengineer");
			        break;
		      case SENIORSOFTWAREENGINEER:
			        System.out.println("The user role is Seniorsoftwareengineer");
			        break;
		      case MANAGER:
			        System.out.println("The user role is Manager");
			        break;
		      case HR:
			        System.out.println("The user role is HR");
			        break;
		      case DIRECTOR:
			        System.out.println("The user role is Director");
			        break;
		      default:
			        System.out.println("The user role doesnt matches with the enum Roles");
	     
		   }
			   
	   }
	   
	   }

}
