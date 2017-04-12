
public class Camera extends Machine {
	
	public void start() {
		System.out.println("Starting Camera.");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in camera.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown camera.");
		
	}
	

}
