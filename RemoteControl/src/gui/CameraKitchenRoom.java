package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CameraKitchenRoom {
	private JFrame frame;
	private JLabel labelImageKitchenRoom;

	private boolean isTurnLightOn;

	public CameraKitchenRoom() {
		
	}

	public void initializeCamera() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 532);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelImageKitchenRoom = new JLabel("Kitchen room");
		if(this.isTurnLightOn == true) {
			labelImageKitchenRoom
			.setIcon(new ImageIcon(CameraKitchenRoom.class.getResource("/image/kitchen-light-on.png")));
		} 
		else if(this.isTurnLightOn == false){ 
			labelImageKitchenRoom
			.setIcon(new ImageIcon(CameraKitchenRoom.class.getResource("/image/kitchen-light-off.png")));
		}
	
		labelImageKitchenRoom.setBounds(0, 0, 800, 532);
		frame.getContentPane().add(labelImageKitchenRoom);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLabelImageKitchenRoom() {
		return labelImageKitchenRoom;
	}

	public void setLabelImageKitchenRoom(JLabel labelImageKitchenRoom) {
		this.labelImageKitchenRoom = labelImageKitchenRoom;
	}

	public boolean isTurnLightOn() {
		return isTurnLightOn;
	}

	public void setTurnLightOn(boolean isTurnLightOn) {
		this.isTurnLightOn = isTurnLightOn;
	}
	
	public void setLightOn() {
		this.getLabelImageKitchenRoom().setIcon(new ImageIcon(CameraKitchenRoom.class.getResource("/image/kitchen-light-on.png")));
	}
	
	public void setLightOff() {
		this.getLabelImageKitchenRoom().setIcon(new ImageIcon(CameraKitchenRoom.class.getResource("/image/kitchen-light-off.png")));
	}
	

}
