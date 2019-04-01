package receiver;

import javax.swing.JButton;

public class GarageDoor {

	String location;

	private JButton btnGarage;
	private JButton btnGarageInRemoteControl;

	private boolean isSelectGarage;

	private int indexOfPanelSlotRemoteControl;

	public GarageDoor() {
		this.btnGarage = new JButton("Garage");
		this.btnGarageInRemoteControl = new JButton("Garage");
		this.isSelectGarage = false;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public JButton getBtnGarage() {
		return btnGarage;
	}

	public void setBtnGarage(JButton btnGarage) {
		this.btnGarage = btnGarage;
	}

	public JButton getBtnGarageInRemoteControl() {
		return btnGarageInRemoteControl;
	}

	public void setBtnGarageInRemoteControl(JButton btnGarageInRemoteControl) {
		this.btnGarageInRemoteControl = btnGarageInRemoteControl;
	}

	public boolean isSelectGarage() {
		return isSelectGarage;
	}

	public void setSelectGarage(boolean isSelectGarage) {
		this.isSelectGarage = isSelectGarage;
	}

	public int getIndexOfPanelSlotRemoteControl() {
		return indexOfPanelSlotRemoteControl;
	}

	public void setIndexOfPanelSlotRemoteControl(int indexOfPanelSlotRemoteControl) {
		this.indexOfPanelSlotRemoteControl = indexOfPanelSlotRemoteControl;
	}

//	public void stop() {
//		System.out.println("Garage stop");
//	}

//	public void lightOn() {
//		System.out.println("Garage light on");
//	}
//
//	public void lightOff() {
//		System.out.println("Garage light off");
//	}

}
