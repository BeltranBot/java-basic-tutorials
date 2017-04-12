
public class Person implements Info{
	// classes can implement any number of interfaces
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello There");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
		
	}

}
