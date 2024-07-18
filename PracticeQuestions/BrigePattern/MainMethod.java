package BrigePattern;

public class MainMethod {
	
	public static void main(String[] args) {
		Shape ti = new Circle(100,100,10,new  RedCircle());
		Shape yt = new Circle(100,100,10,new GreenCircle());
		ti.draw();
		yt.draw();
	}

}
