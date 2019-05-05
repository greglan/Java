package examples;

/**
 * This class is an example to demonstrate how to define an use classes.
 * This class is named 'SimpleClass' and must be defined in a 'SimpleClass.java' file
 */
public class SimpleClass {
	int var0; // Defaults to 'public': accessible to everyone
	private int var1; // private: accessible only to the class itself
	protected int var2; // protected: accessible only to the class itself and children

	// Instance variables must be declared static

	/**
	 * Default constructor
	 * Constructors are always named after the class
	 */
	public SimpleClass(){
		var0 = 0;
		this.var1 = 1;  // Reference to the object itself
		var2 = 2;
	}


	/**
	 * Constructor with a parameter
	 * @param arg
	 */
	public SimpleClass(int arg) // Overloading
	{
		var0 = arg;
		var1 = arg;
		var2 = arg;
	}

	public static void main(String[] args){
		SimpleClass simple = new SimpleClass();
	}

}

// Inheritance
class SimpleClassChild extends SimpleClass {

}
