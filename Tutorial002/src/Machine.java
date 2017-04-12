
public class Machine {
	
	// public allows the use of a variable or function
	// within the package that contains the class
	
	// private restricts the user of a variable or function
	// to the class where it is declared
	
	// protected allows the use of a variable or function
	// within the package that contains the class and also
	// the classes that inherit from it
	
	protected String name = "Machine type 1";

	public void start() {
		System.out.println("Machine started.");
	}
	public void stop() {
		System.out.println("Machine stopped.");
	}
	
}
