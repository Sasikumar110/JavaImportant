package BrigePattern;

public abstract class Shape {
	
	protected DrawApi draw;
	
	protected Shape(DrawApi draw)
	{
		this.draw = draw;
	}
	
	public abstract void draw();

}
