package creational.abstractFactory;

public class Rectangle extends Box {

	public Rectangle(double width, double length){
		
		this.length = length;
		this.width = width;
	}
	
	public double getArea(){
		return this.length * this.width;
	}
}
