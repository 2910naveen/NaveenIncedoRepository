package factorypatterndesign;

public interface OS 
{
   void specs();
   default void printOs()
   {
	   System.out.println("inside printos method of OS Interface");
   }
}
