package camera;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CameraLivingRoom {

	private JFrame frame;
	JLabel labelImageLivingRoom;

	private static final long serialVersionUID = 1L;

	private boolean isTurnOnLight = false;

	private JButton btnLivingRoomCamera;

	public CameraLivingRoom() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		labelImageLivingRoom = new JLabel("Living room");
		loadImage();
	}

	private void loadImage() {

		if (this.isTurnOnLight == true) {
			labelImageLivingRoom
					.setIcon(new ImageIcon(CameraLivingRoom.class.getResource("image/living-room-light-on.jpeg")));
		} else {
			labelImageLivingRoom
					.setIcon(new ImageIcon(CameraLivingRoom.class.getResource("image/living-room-light-off.jpeg")));
		}
		labelImageLivingRoom.setBounds(0, 0, 800, 532);
		frame.getContentPane().add(labelImageLivingRoom);
	}

	public JButton getBtnLivingRoomCamera() {
		return btnLivingRoomCamera;
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

	public void setBtnLivingRoomCamera(JButton btnLivingRoomCamera) {
		this.btnLivingRoomCamera = btnLivingRoomCamera;
	}

	public boolean isTurnOnLight() {
		return isTurnOnLight;
	}

	public void setTurnOnLight(boolean isTurnOnLight) {
		this.isTurnOnLight = isTurnOnLight;
	}

}
