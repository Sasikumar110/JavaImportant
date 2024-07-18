package DecoratorPattern;

public abstract class ShapeDecorator  implements Shape{
	protected Shape decorator;
	
	public ShapeDecorator(Shape decorater)
	{
		this.decorator=decorater;
	}
	
	public void draw()
	{
		decorator.draw();
	}

}
