package FactorialDesignPattern;

public class MainMethod {

	public static void main(String[] args) {
		Restaurent rt = new VegBurgerRestarent();
		Burger bg =rt.createBurger("INDIAN");
		bg.prepare();
	}

}
