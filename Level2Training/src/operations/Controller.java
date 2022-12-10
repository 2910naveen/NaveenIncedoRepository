package operations;

public interface Controller 
{
	default void Controller(Notebook notebook,NBDiffCell cell)
	{
		
	}
    default void render(HTMLElement container)
    {
    	
    }
	default void postRender()
	{
		
	}
	
	default void preRender()
	{
		
	}
}
