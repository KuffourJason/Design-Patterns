package creational.factory;

public class exampleClass {

	public static void main(String[] args){
				
		Box square = BoxFactory.getBox("square", 45, 45);
		Box rectangle = BoxFactory.getBox("rectangle", 45, 145);
		
		System.out.println("The area of the rectangle is " + rectangle.getArea());
		System.out.println("The area of the square is " + square.getArea());
	}
}
