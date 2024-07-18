package AbstractFactoryMethod;

public class MainMethod {
	
	public static void main(String[] args) {
	   KitchenInterface kf = new Chef1(KitchenInterface.india);
	   kf.getIndianFood().IndianCurry();
	   kf.getIndianFood().IndianKabab();
	   
	}

}
