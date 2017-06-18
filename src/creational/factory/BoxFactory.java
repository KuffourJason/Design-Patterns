package creational.factory;

public class BoxFactory  {

	public static Box getBox(String type, double length, double width){
		
		if(type.equalsIgnoreCase("rectangle")){
			return new Rectangle(width, length);
		}
		else if(type.equalsIgnoreCase("square")){
			return new Square(width);
		}
		
		return null;
	}
}
