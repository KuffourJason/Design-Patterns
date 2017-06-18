package creational.abstractFactory;

public class Square extends Box {

	public Square(double w){
		this.length = w;
		this.width = w;
	}
	
	public double getArea(){
		
		return this.length * this.width;
	}
}
