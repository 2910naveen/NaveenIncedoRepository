package date17112022;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;
import java.lang.reflect.Field;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface DataBaseField{
	String name();
	Class<?> type();
	boolean isPrimaryKey() default false;
}

 class UserDetails{
	@DataBaseField(name="id",isPrimaryKey=true,type=Integer.class)
	private int id;
	
	@DataBaseField(name="name",isPrimaryKey=false,type=String.class)
	private String name;
	
	@DataBaseField(name="email",isPrimaryKey=false,type=String.class)
	private String email;
	
	@DataBaseField(name="created",isPrimaryKey=false,type=Date.class)
	private Date created;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
 
public class Problem3 
{
	public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException
	{
		
		        System.out.println("Java Custom Annotation Example");
		        System.out.println();
		  
		        UserDetails usr = new UserDetails();
		        usr.setEmail("john.doe@example.com");
		        usr.setName("John Doe");
		        usr.setId(112);
		        usr.setCreated(new Date());
		  
		        for (Field field : usr.getClass().getDeclaredFields()) {
		            DataBaseField dbField = field.getAnnotation(DataBaseField.class);
		            System.out.println("field name: " + dbField.name());
		  
		            // changed the access to public
		            field.setAccessible(true);
		            Object value = field.get(usr);
		            System.out.println("field value: " + value);
		  
		            System.out.println("field type: " + dbField.type());
		            System.out.println("is primary: " + dbField.isPrimaryKey());
		            System.out.println();
		       
		}
	}
	
}
