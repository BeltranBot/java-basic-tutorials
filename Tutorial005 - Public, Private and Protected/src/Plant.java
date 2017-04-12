
public class Plant {
	// bad practice
	public String name;
	
	private String type;
	// Acceptable practice --- it's final
	public final static int ID = 8;
	
	protected String size;
	
	
	public Plant(){
		name = "Freddy.";
		type = "plant";
		size = "medium";
	}
	
	
	

}
