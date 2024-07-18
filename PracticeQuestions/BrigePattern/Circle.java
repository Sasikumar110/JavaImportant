package BrigePattern;

public class Circle extends Shape{
	
	private int x,y,radius;
	
	public Circle(int x,int y,int radius,DrawApi draw)
	{
		super(draw);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void draw()
	{
		draw.drawCircle(radius, x, y);
	}
	

}
