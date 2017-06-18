package creational.abstractFactory;

public class SquareFactory implements BoxAbstractFactory {

	private double width;
	
	public SquareFactory(double width){
		
		this.width = width;
	}
	
	public Box createBox() {
		return new Square(width);
	}

}
