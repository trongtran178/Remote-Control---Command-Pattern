package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CameraCeilingFan {
	private JFrame frame;
	private JLabel labelImageCeilingFan;

	private int speed;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	public CameraCeilingFan() {

	}

	public void initializeCamera() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 532);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelImageCeilingFan = new JLabel("CeilingFan");

		if (this.speed == HIGH) {
			this.labelImageCeilingFan
					.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-high.gif")));
		} else if (this.speed == MEDIUM) {
			this.labelImageCeilingFan
					.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-medium.gif")));
		} else if (this.speed == LOW) {
			this.labelImageCeilingFan
					.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-low.gif")));
		} else if (this.speed == OFF) {
			this.labelImageCeilingFan
					.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-off.gif")));
		}

		labelImageCeilingFan.setBounds(0, 0, 800, 532);
		frame.getContentPane().add(labelImageCeilingFan);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLabelImageCeilingFan() {
		return labelImageCeilingFan;
	}

	public void setLabelImageCeilingFan(JLabel labelImageCeilingFan) {
		this.labelImageCeilingFan = labelImageCeilingFan;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setCeilingFanHigh() {
		this.setSpeed(HIGH);
		this.labelImageCeilingFan
				.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-high.gif")));
	}

	public void setCeilingFanMedium() {
		this.setSpeed(MEDIUM);
		this.labelImageCeilingFan
				.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-medium.gif")));
	}

	public void setCeilingFanLow() {
		this.setSpeed(LOW);
		this.labelImageCeilingFan
				.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-low.gif")));
	}

	public void setCeilingFanOff() {
		this.setSpeed(OFF);
		this.labelImageCeilingFan
				.setIcon(new ImageIcon(CameraCeilingFan.class.getResource("/image/ceiling-fan-off.gif")));
	}

}
