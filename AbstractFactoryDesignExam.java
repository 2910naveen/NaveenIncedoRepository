package abstractFactoryDesignPattern;

interface Windows
{
	void defineWindow();
}
class PMWindow implements Windows
{
	public void defineWindow()
	{
		System.out.println("A window is a separate viewing area on the computer screen");
		System.out.println("PMWindows are managed by PMWindow Manager");
	}
}
class MotifWindow implements Windows
{
	public void defineWindow()
	{
		System.out.println("A window is a separate viewing area on the computer screen");
		System.out.println("A MotifWindow is managed by MotifWindowManager");
	}
}
interface ScrollBar
{
	void defineScrollBar();
}

class PMScrollBar implements ScrollBar
{
	public void defineScrollBar()
	{
		System.out.println("A scrollbar enables the user to scroll the content on window");
		System.out.println("Inside PMScrollBar");
	}
}

class MotifScrollBar implements ScrollBar
{
	public void defineScrollBar()
	{
		System.out.println("A scrollbar enables the user to scroll the content on window");
		System.out.println("Inside MotifScrollBar");
	}
}
interface WidgetFactory
{
	ScrollBar createScrollBar();
	Windows createWindows();
}

class MotifWidgetFactory implements WidgetFactory
{
	public ScrollBar createScrollBar()
	{
		return new MotifScrollBar();
	}
	
	public Windows createWindows()
	{
		return new MotifWindow();
	}

}

class PMWidgetFactory implements WidgetFactory
{
	public ScrollBar createScrollBar()
	{
		return new PMScrollBar();
	}
	
	public Windows createWindows()
	{
		return new PMWindow();
	}

}

class FactoryProviderForAbstract
{
	public WidgetFactory getFactoryFromProvider(String FactoryName)
	{
		if(FactoryName.equalsIgnoreCase("MOTIF"))
		{
			return new MotifWidgetFactory();
		}
		else if(FactoryName.equalsIgnoreCase("PM"))
		{
			return new PMWidgetFactory();
		}
		else
		{
			return null;
		}
	}
}
public class AbstractFactoryDesignExam 
{
	public static void main(String args[])
	{
		FactoryProviderForAbstract f = new FactoryProviderForAbstract();
	    WidgetFactory w1 = f.getFactoryFromProvider("motif");
	    Windows w = w1.createWindows();
	    ScrollBar s1 = w1.createScrollBar();
	    WidgetFactory w2 = f.getFactoryFromProvider("PM");
	    Windows p = w2.createWindows();
	    ScrollBar s = w2.createScrollBar();
	    w.defineWindow();
	    s1.defineScrollBar();
	    p.defineWindow();
	    s.defineScrollBar();
	}
}
