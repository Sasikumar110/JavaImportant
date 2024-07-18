package DecoratorPattern;

public class MainMethod {
	
	public static void main(String[] args) {
		Shape circl =  new  Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("Circle border");
		circl.draw();
	}

}
