package ProtoTypeDesignPattern;

public class ShapeClient {
	
	private Shape shapeProto;
	
	public ShapeClient(Shape shapeProto)
	{
		this.shapeProto=shapeProto;
	}
	
	public Shape createShape() {
		return shapeProto.clone();
	}

}
