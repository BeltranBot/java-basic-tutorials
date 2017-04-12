import java.util.ArrayList;

class Machine {
	public String toString() {
		return "I am a machine.";
	}
	
	public void start() {
		System.out.println("Machine Started.");
	}

}

class Camera extends Machine {
	public String toString() {
		return "I am a camera.";
	}
	
	public void snap() {
		System.out.println("snap");
	}

}

public class App {
	public static void main(String[] args) {
		ArrayList<Machine> machines = new ArrayList<Machine>();
		machines.add(new Machine());
		machines.add(new Machine());
		//showList(machines);

		ArrayList<Camera> cameras = new ArrayList<Camera>();
		cameras.add(new Camera());
		cameras.add(new Camera());
		//showList(cameras);
		showList2(machines);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);

		}

	}
	
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);		

		}

	}
}
