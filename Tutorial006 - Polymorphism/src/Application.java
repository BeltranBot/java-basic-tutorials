
public class Application {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		// when a method is called, java checks
		// and executes the code that is implemented
		// in the method of the class of the object that is being referenced
		// and not the class of the variable we are using was created with.
		plant2.grow();
		tree.shedLeaves();
		
		// this won't work
		// plant2.shedLeaves();
		doGrow(tree);
		doGrow(plant1);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
