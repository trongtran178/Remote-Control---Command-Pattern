package receiver;

public class GarageDoor {

	String location;

	public GarageDoor() {

	}

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println("Garage door is open");
	}

	public void down() {
		System.out.println("Garage door down");
	}

	public void stop() {
		System.out.println("Garage stop");
	}

	public void lightOn() {
		System.out.println("Garage light on");
	}

	public void lightOff() {
		System.out.println("Garage light off");
	}

}
