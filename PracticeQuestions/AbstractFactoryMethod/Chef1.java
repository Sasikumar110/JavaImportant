package AbstractFactoryMethod;

public class Chef1  implements KitchenInterface{
	
	private int order;
	public Chef1(int order)
	{
		this.order=order;
	}
	
	public ChineseFood getChinesFood()
	{
		switch (order) {
		case chinese:
			System.out.println("Order For checf1");
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
			System.out.println("Order for Chef1");
			return new IndianPackages();
		}
		return null;
	}

	
	
	
	
	
}
