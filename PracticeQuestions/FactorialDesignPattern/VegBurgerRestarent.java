package FactorialDesignPattern;

public  class VegBurgerRestarent extends Restaurent {

 
	public Burger createBurger(String type) {
		return new VegBurger();
	}
	

}
