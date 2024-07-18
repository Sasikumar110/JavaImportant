package ProtoTypeDesignPattern;

public class Circle implements Shape{
	
	private String colour;
	
	public Circle(String colour)
	{
		this.colour=colour;
	}
	
	public Shape clone()
	{
		return new Circle(this.colour);
	}
	
	public void draw()
	{
		System.out.println("Drawing Colour :"+colour);
	}

}
