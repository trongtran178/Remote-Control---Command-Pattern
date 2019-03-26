package receiver;

public class Stereo {

	String location;

	public Stereo() {

	}

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("turn stereo on");
	}

	public void off() {
		System.out.println("turn stereo off");
	}

	public void setCD() {
		System.out.println("SET CD");
	}

	public void setDVD() {
		System.out.println("SET DVD");
	}

	public void setRadio() {
		System.out.println("SET RADIO");
	}

	public void setVolumn(int volumnValue) {
		System.out.println("volumn value : " + volumnValue);
	}

}
