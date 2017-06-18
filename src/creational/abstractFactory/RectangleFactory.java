package creational.abstractFactory;

public class RectangleFactory implements BoxAbstractFactory {

	private double width;
	private double length;
	
	public RectangleFactory(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public Box createBox() {
		return new Rectangle(width,length);
	}

}
