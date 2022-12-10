package buildingPatternDesign;

abstract class MobileRequirements
{
	abstract void setModelName(String name);
	abstract void setProcessor(String processor);
	abstract void setDisplayResolution(String resolution);
	abstract void setRAM(int RAMinGB);
	abstract void setROM(int ROMinGB);
}

class MobileRequirementsImpl extends MobileRequirements
{
    String name;
    String processor;
    String resolution;
    int RAMinGB;
    int ROMinGB;
    
	void setModelName(String name)
	{
	   this.name = name;  	
	   System.out.println("The name of the model is "+this.name);
	}

	@Override
	void setProcessor(String processor)
	{
		this.processor = processor;
		System.out.println("The processor of the mobile is "+this.processor);
	}

	@Override
	void setDisplayResolution(String resolution)
	{
	    this.resolution = resolution;
	    System.out.println("The processor of the resolution is "+this.resolution);
	}

	@Override
	void setRAM(int RAMinGB)
	{
		this.RAMinGB = RAMinGB;
		System.out.println("The ram of the mobile is "+this.RAMinGB);
	}

	@Override
	void setROM(int ROMinGB)
	{
		this.ROMinGB = ROMinGB;
		System.out.println("The rom of the mobile is "+this.ROMinGB);
		
	}
	
}

abstract class BuildMobile
{
    abstract MobileRequirements getMobile();
	abstract void buildModelName();
	abstract void buildProcessor();
	abstract void buildDisplayResolution();
	abstract void buildRam();
	abstract void buildRom();
}

class OnePlus extends BuildMobile
{
	private MobileRequirementsImpl mobile;
	public OnePlus()
	{
		this.mobile = new MobileRequirementsImpl();
	}
	@Override
	void buildModelName()
	{
		this.mobile.setModelName("OnePlus Nord 2T 5G");
	}

	@Override
	void buildProcessor()
	{
	    this.mobile.setProcessor("Mediatek Dimensity 1300");
		
	}

	@Override
	void buildDisplayResolution()
	{
	   this.mobile.setDisplayResolution("2400 X 1080");	
	}

	@Override
	void buildRam()
	{
		this.mobile.setRAM(8);
	}

	@Override
	void buildRom()
	{
		this.mobile.setROM(128);
	}
	@Override
	MobileRequirements getMobile() {
		// TODO Auto-generated method stub
		return this.mobile;
	}

	
}
class Apple extends BuildMobile
{
	private MobileRequirementsImpl mobile;
	public Apple()
	{
		this.mobile = new MobileRequirementsImpl();
	}
	@Override
	void buildModelName()
	{
		this.mobile.setModelName("iPhone 14");
	}

	@Override
	void buildProcessor()
	{
	    this.mobile.setProcessor("A15 bionic");
		
	}

	@Override
	void buildDisplayResolution()
	{
	   this.mobile.setDisplayResolution("1170 x 2532 pixels");	
	}

	@Override
	void buildRam()
	{
		this.mobile.setRAM(12);
	}

	@Override
	void buildRom()
	{
		this.mobile.setROM(512);
	}
	
	public MobileRequirementsImpl getMobile()
	{
		return this.mobile;
	}
}

class Mobile
{
	BuildMobile obj;
	public Mobile()
	{
		
	}
	public Mobile(String mobile)
	{
		if(mobile.equals("Apple"))
		{
			this.obj = new Apple();
		}
		else if(mobile.equals("Android"))
		{
			this.obj = new OnePlus();
		}
	}
	public void AssembleMobile()
	{
		this.obj.buildModelName();
		this.obj.buildProcessor();
		this.obj.buildDisplayResolution();
		this.obj.buildRam();
		this.obj.buildRom();
	}
	public  MobileRequirements get()
	{
		return this.obj.getMobile();
	}
}
public class Client 
{
   public static void main(String args[])
   {
	  Mobile m1 = new Mobile("Apple");
      m1.AssembleMobile();
      System.out.println(m1.get());
      Mobile m2 = new Mobile("Android");
      m2.AssembleMobile();
      System.out.println(m2.get());
	  
	  
   }
}
