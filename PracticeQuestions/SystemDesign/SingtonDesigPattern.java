package SystemDesign;

public class SingtonDesigPattern {
	
	private static SingtonDesigPattern instance;
	private SingtonDesigPattern()
	{
		System.out.println("Single Designe Pattern");
	}
	
	public static SingtonDesigPattern getInstance()
	{
		if(instance==null)
		{
			instance=new SingtonDesigPattern();
		}
		return instance;
	}
	
	public static void doSmothing()
	{
	System.out.println("Something is Done");	
	}

}
