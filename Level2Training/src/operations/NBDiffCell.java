package operations;

public interface NBDiffCell extends Controller
{
   //Notebook notebook;
	String log="Naveen";
	default void log(String msg)
	{
		System.out.println(msg);
	}
	default void init()
	{
		
	}
	void save();
	void mergeRows();
	
   
}
