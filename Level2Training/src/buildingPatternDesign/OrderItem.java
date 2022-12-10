package buildingPatternDesign;

interface ItemDetails
{
	void setItemPrice(double itemPrice);
	void setItemName(String itemName);
	void setItemDiscountPercent(double discountPercent);
	void setItemId(int itemId);
}
class ItemDetailsImpl implements ItemDetails{
	
	double itemPrice;
	String itemName;
	double itemDiscountPercent;
	int itemId;
	public void setItemPrice(double itemPrice)
	{
		this.itemPrice = itemPrice;
		System.out.println("The price of item is "+itemPrice);
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
		System.out.println("The Name of item is "+itemName);
	}
	public void setItemDiscountPercent(double itemDiscountPercent)
	{
		this.itemDiscountPercent = itemDiscountPercent;
		System.out.println("The DiscountPercent of item is "+itemDiscountPercent);
	}
	public void setItemId(int itemId)
	{
		this.itemId = itemId;
		System.out.println("The itemId of item is "+itemId);
	}
}
interface BuildItemDetails
{
	ItemDetailsImpl getItem();
	void buildItemPrice();
	void buildItemName();
	void buildItemDiscountPercent();
	void buildItemId();
}

class Burger implements BuildItemDetails
{
	private ItemDetailsImpl item;
	public Burger()
	{
		this.item = new ItemDetailsImpl();
		System.out.println("This is Burger item");
	}
	public void buildItemPrice()
	{
		this.item.setItemPrice(149.50);
	}
	public void buildItemName()
	{
		this.item.setItemName("Burger");
	}
	public void buildItemDiscountPercent()
	{
		this.item.setItemDiscountPercent(9.99);
	}
	public void buildItemId()
	{
		this.item.setItemId(1234);
	}
	public ItemDetailsImpl getItem()
	{
		return this.item;
	}
	
}

class CoolDrinks implements BuildItemDetails
{
	private ItemDetailsImpl item;
	public CoolDrinks()
	{
		this.item = new ItemDetailsImpl();
		System.out.println("This is CoolDrinks item");
	}
	public void buildItemPrice()
	{
		this.item.setItemPrice(70.50);
	}
	public void buildItemDiscountPercent()
	{
		this.item.setItemDiscountPercent(25.5);
	}
	public void buildItemId()
	{
		this.item.setItemId(1352);
	}
	public void buildItemName()
	{
		this.item.setItemName("CoolDrinks");
	}
	public ItemDetailsImpl getItem()
	{
		return this.item;
	}
	
}
class Item
{
	private BuildItemDetails obj;
	public Item()
	{
		
	}
	public Item(String itemName)
	{
		if(itemName.equalsIgnoreCase("BURGER"))
		{
			obj = new Burger();
		}
		else if(itemName.equalsIgnoreCase("COOLDRINKS"))
		{
			obj = new CoolDrinks();
		}
	}
	public void AssociateItem()
	{
		this.obj.buildItemName();
		this.obj.buildItemPrice();
		this.obj.buildItemId();
		this.obj.buildItemDiscountPercent();
	}
	public ItemDetailsImpl get()
	{
		return this.obj.getItem();
	}
}
public class OrderItem 
{
	public static void main(String args[])
	{
		Item b = new Item("burger");
		b.AssociateItem();
		System.out.println(b.get());
		Item c = new Item("CoolDrinks");
		c.AssociateItem();
		System.out.println(c.get());
		
	}

}
