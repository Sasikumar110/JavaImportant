package FactorialDesignPattern;

public abstract class Restaurent {
	
	public Burger orderBurger()
	{
		String req="";
		Burger bg = createBurger(req);
		bg.prepare();
		return bg;
				
	}
	public abstract Burger createBurger(String reuqest);
	

}
