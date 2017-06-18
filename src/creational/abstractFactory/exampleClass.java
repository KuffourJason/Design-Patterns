package creational.abstractFactory;

public class exampleClass {

	public static void main(String[] args){
		
		Box square = BoxFactory.getBox(new SquareFactory(124));
		Box rectangle = BoxFactory.getBox(new RectangleFactory(894,634));
		
		System.out.println("The area of the rectangle is " + rectangle.getArea());
		System.out.println("The area of the square is " + square.getArea());
	}
}
