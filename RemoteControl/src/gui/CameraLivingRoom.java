package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class CameraLivingRoom {

	private JFrame frame;
	private JLabel labelImageLivingRoom;

	private boolean isTurnLightOn;

	public CameraLivingRoom() {
		
	}
	
	public void initializeCamera() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 532);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelImageLivingRoom = new JLabel("Living room");
		if(this.isTurnLightOn == true) {
			labelImageLivingRoom
			.setIcon(new ImageIcon(CameraLivingRoom.class.getResource("/image/living-room-light-on.jpeg")));
		} 
		else if(this.isTurnLightOn == false){ 
			labelImageLivingRoom
			.setIcon(new ImageIcon(CameraLivingRoom.class.getResource("/image/living-room-light-off.jpeg")));
		}
	
		labelImageLivingRoom.setBounds(0, 0, 800, 532);
		frame.getContentPane().add(labelImageLivingRoom);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLabelImageLivingRoom() {
		return labelImageLivingRoom;
	}

	public void setLabelImageLivingRoom(JLabel labelImageLivingRoom) {
		this.labelImageLivingRoom = labelImageLivingRoom;
	}

	public boolean isTurnLightOn() {
		return isTurnLightOn;
	}

	public void setTurnLightOn(boolean isTurnLightOn) {
		this.isTurnLightOn = isTurnLightOn;
	}

}
