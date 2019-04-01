package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CameraGarageDoor {

	private JFrame frame;
	private JLabel labelGarageDoor;
	private boolean isOpenGarageDoor;
	
	
	
	

	public CameraGarageDoor() {
//		initialize();
	}
	
	public void initializeGarage() {
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
		
		
		
		
	}

}
