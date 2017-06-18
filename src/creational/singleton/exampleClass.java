package creational.singleton;

public class exampleClass {

	public static void main(String[] args){
		
		singletonClass s1 = singletonClass.getInstance();
		singletonClass s2 = singletonClass.getInstance();
		
		System.out.println("Hashcode of singletonClass object 1: " + s1.hashCode());
		System.out.println("Hashcode of singletonClass object 2: " + s2.hashCode());

		System.out.println("Identical hashcode values signify that only one instance of the class is ever created");
	}
}
