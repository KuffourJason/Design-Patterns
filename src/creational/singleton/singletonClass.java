package creational.singleton;

/**
 * @author jason
 *
 * Implementation of the Singleton design pattern using lazy 
 * instantiation
 * 
 */
public class singletonClass {

	//single instance of this class
	private static singletonClass instance;
	
	//private constructor
	private singletonClass(){}
	
	/**
	 * @return - the only instance of this class
	 */
	public static singletonClass getInstance(){
		
		//creates an instance if method is invoked 
		//for the first time
		if( instance == null){
			instance = new singletonClass();
		}
		
		return instance;
	}
}
