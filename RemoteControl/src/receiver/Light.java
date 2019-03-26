package receiver;

import javax.swing.JButton;

public class Light {

	String location;

	JButton btnLight;

	JButton btnLightInRemoteControl;
	
	private int indexOfPanelSlotRemoteControl;

	public JButton getBtnLightInRemoteControl() {
		return btnLightInRemoteControl;
	}

	public void setBtnLightInRemoteControl(JButton btnLightInRemoteControl) {
		this.btnLightInRemoteControl = btnLightInRemoteControl;
	}

	private boolean isSelectedLight;

	public boolean isSelectedLight() {
		return isSelectedLight;
	}

	public void setSelectedLight(boolean isSelectedLight) {
		this.isSelectedLight = isSelectedLight;
	}

	public JButton getBtnLight() {
		return btnLight;
	}

	public void setBtnLight(JButton btnLight) {
		this.btnLight = btnLight;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Light() {

	}

	public Light(String location) {
		this.location = location;
		this.btnLight = new JButton();
		this.btnLightInRemoteControl = new JButton();
		this.isSelectedLight = false;
	}

	public void on() {
		System.out.println("Turn the light on");
	}

	public void off() {
		System.out.println("Turn the light off");
	}

	public int getIndexOfPanelSlotRemoteControl() {
		return indexOfPanelSlotRemoteControl;
	}

	public void setIndexOfPanelSlotRemoteControl(int indexOfPanelSlotRemoteControl) {
		this.indexOfPanelSlotRemoteControl = indexOfPanelSlotRemoteControl;
	}
}
