package DecoratorPattern;

public class RedShapeDecorator  extends ShapeDecorator{

	public RedShapeDecorator(Shape decorater) {
		super(decorater);
	}
	
	public void draw()
	{
		decorator.draw();	
	}
	
	private void setRedBorder(Shape decorator)
	{
		System.out.println("Border color : Red");
	}

}
