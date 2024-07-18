package SystemDesign;

public class MainMethod {
	
	public static void main(String[] args) {
		BilderDesignPattern ui = new BilderDesignPattern.Builder(false, "sasi").build();
		System.out.println(ui.getFound());
		System.out.println(ui.getFurnit());
	}

}
