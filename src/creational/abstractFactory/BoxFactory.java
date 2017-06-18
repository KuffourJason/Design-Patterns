package creational.abstractFactory;

public class BoxFactory {

	public static Box getBox(BoxAbstractFactory factory){
		
		return factory.createBox();
	}
}
