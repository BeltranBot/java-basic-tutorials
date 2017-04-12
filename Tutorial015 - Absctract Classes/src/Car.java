
public class Car extends Machine {
	
	public void start() {
		System.out.println("Starting Car");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in car.");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown car.");
	}

}
