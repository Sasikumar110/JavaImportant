package AbstractFactoryMethod;

public class Chef2  implements KitchenInterface{
	
	private int order;
	public Chef2(int order)
	{
		this.order=order;
	}
	
	public ChineseFood getChinesFood()
	{
		switch (order) {
		case chinese:
			System.out.println("Order For checf2");
			return new ChinesePackages(); 
			}
       return null;
	}
	
	public MexicanFood getMexicanfood()
	{
		switch(order)
		{
		case mexico:
		    System.out.println("Order for Chef2");
		    return new MexicanPackages();
		}
		return null;
	}
	
	public IndianFood getIndianFood()
	{
		switch(order)
		{
		case india:
			System.out.println("Order for Chef2");
			return new IndianPackages();
		}
		return null;
	}
	
}
