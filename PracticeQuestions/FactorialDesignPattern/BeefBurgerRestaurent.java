package FactorialDesignPattern;

public class BeefBurgerRestaurent extends Restaurent {

	@Override
	public Burger createBurger(String Request) {
		Burger bg =null;
		if("INDIAN".equals(Request)) {
			bg=new IndianBeefBurger();
		}
		else {
			bg = new ItalianBeefBurger();
		}
		return new BeefBurger();
	}

}
