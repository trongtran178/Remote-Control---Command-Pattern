package camera;

import javax.swing.JButton;

public class CameraLivingRoom {

	private boolean isTurnOnLight = false;
	
	private JButton btnLivingRoomCamera;
	

	public boolean isTurnOnLight() {
		return isTurnOnLight;
	}

	public void setTurnOnLight(boolean isTurnOnLight) {
		this.isTurnOnLight = isTurnOnLight;
	}

}
