package ProtoTypeDesignPattern;

public class MainFun {
	
	public static void main(String[] args) {
		    Shape cl = new Circle("red");
		    ShapeClient client = new ShapeClient(cl);
		    Shape red = client.createShape();
		    red.draw();
	}

}
