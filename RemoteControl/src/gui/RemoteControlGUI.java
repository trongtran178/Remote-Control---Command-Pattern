package gui;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;

import client.RemoteControl;
import receiver.CeilingFan;
import receiver.GarageDoor;
import receiver.Light;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemoteControlGUI {

	private JFrame frame;
	private RemoteControl remoteControl;
	Light livingRoomLight = new Light("Living room");
	CeilingFan ceilingFanWithHighSpeed = new CeilingFan();
	CeilingFan ceilingFanWithMediumSpeed = new CeilingFan();
	CeilingFan ceilingFanWithLowSpeed = new CeilingFan();
	GarageDoor garage = new GarageDoor();

	JPanel panelConcreteCommand;

	JPanel panelSlotConcreteCommand;

	JPanel panelRemoteControl;

	JPanel panelOnOfButton;

	JButton btnCameraDenPhongKhach;
	JButton btnCameraDenNhaBep;
	JButton btnCameraGarage;
	JButton btnCameraDenVuon;
	JButton btnCameraQuatTran;
	JButton btnCameraTivi;
	private CameraLivingRoom cameraLivingRoom;
	private CameraCeilingFan cameraCeilingFan;
	// private CameraGarageDoor cameraGarageDoor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoteControlGUI windowRemoteControl = new RemoteControlGUI();
					windowRemoteControl.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemoteControlGUI() {
		initializeGUI();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1002, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		remoteControl = new RemoteControl();

		panelConcreteCommand = new JPanel();
		panelConcreteCommand.setBackground(SystemColor.activeCaption);
		panelConcreteCommand.setBounds(0, 0, 224, 552);
		frame.getContentPane().add(panelConcreteCommand);
		panelConcreteCommand.setLayout(null);

		panelRemoteControl = new JPanel();
		panelRemoteControl.setBackground(Color.DARK_GRAY);
		// panelRemoteControl.bor
		panelRemoteControl.setBounds(430, 41, 315, 414);
		frame.getContentPane().add(panelRemoteControl);
		panelRemoteControl.setLayout(null);

		JLabel lblRemoteControl = new JLabel("B\u1ED9 \u0111i\u1EC1u khi\u1EC3n th\u00F4ng minh");
		lblRemoteControl.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRemoteControl.setForeground(Color.WHITE);
		lblRemoteControl.setBounds(61, 11, 190, 35);
		panelRemoteControl.add(lblRemoteControl);

		panelSlotConcreteCommand = new JPanel();
		panelSlotConcreteCommand.setBounds(10, 57, 175, 322);
		panelRemoteControl.add(panelSlotConcreteCommand);
		panelSlotConcreteCommand.setLayout(new GridLayout(7, 1, 50, 0));

		JLabel lblGiuCho0 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho0);

		JLabel lblGiuCho1 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho1);

		JLabel lblGiuCho2 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho2);

		JLabel lblGiuCho3 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho3);

		JLabel lblGiuCho4 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho4);

		JLabel lblGiuCho5 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho5);

		JLabel lblGiuCho6 = new JLabel("");
		panelSlotConcreteCommand.add(lblGiuCho6);

		panelOnOfButton = new JPanel();
		panelOnOfButton.setBounds(195, 57, 110, 322);
		panelRemoteControl.add(panelOnOfButton);
		panelOnOfButton.setLayout(new GridLayout(7, 2, 0, 0));
		// initialize radio on/off button
		for (int i = 0; i < 7; i++) {
			panelOnOfButton.add(remoteControl.getListRadioOn()[i].getRadioButton());
			panelOnOfButton.add(remoteControl.getListRadioOff()[i].getRadioButton());
		}

		cameraLivingRoom = new CameraLivingRoom();
		cameraLivingRoom.initializeCamera();
		cameraCeilingFan = new CameraCeilingFan();
		cameraCeilingFan.initializeCamera();

		// camera here
		btnCameraDenPhongKhach = new JButton("Camera ph\u00F2ng kh\u00E1ch");
		btnCameraDenPhongKhach.setBounds(234, 65, 167, 23);
		frame.getContentPane().add(btnCameraDenPhongKhach);

		btnCameraDenNhaBep = new JButton("Camera nh\u00E0 b\u1EBFp");
		btnCameraDenNhaBep.setBounds(234, 176, 167, 23);
		frame.getContentPane().add(btnCameraDenNhaBep);

		btnCameraGarage = new JButton("Camera Garage");
		btnCameraGarage.setBounds(234, 279, 167, 23);
		frame.getContentPane().add(btnCameraGarage);

		btnCameraDenVuon = new JButton("Camera \u0111\u00E8n v\u01B0\u1EDDn");
		btnCameraDenVuon.setBounds(769, 65, 146, 23);
		frame.getContentPane().add(btnCameraDenVuon);

		btnCameraQuatTran = new JButton("Camera qu\u1EA1t tr\u1EA7n");
		btnCameraQuatTran.setBounds(769, 176, 146, 23);
		frame.getContentPane().add(btnCameraQuatTran);

		btnCameraTivi = new JButton("Camera Tivi");
		btnCameraTivi.setBounds(769, 279, 146, 23);
		frame.getContentPane().add(btnCameraTivi);
		// camera end here

		livingRoomLight.getBtnLight().setText("Đèn phòng khách");
		livingRoomLight.getBtnLight().setBounds(10, 22, 204, 40);

		panelConcreteCommand.add(livingRoomLight.getBtnLight());

		ceilingFanWithHighSpeed.getBtnCeilingFan().setText("Quạt trần - số 3");
		ceilingFanWithHighSpeed.getBtnCeilingFan().setBounds(10, 72, 204, 40);

		panelConcreteCommand.add(ceilingFanWithHighSpeed.getBtnCeilingFan());
		
		ceilingFanWithMediumSpeed.getBtnCeilingFan().setText("Quạt trần - số 2");
		ceilingFanWithMediumSpeed.getBtnCeilingFan().setBounds(10, 122, 204, 40);
		panelConcreteCommand.add(ceilingFanWithMediumSpeed.getBtnCeilingFan());
		
		ceilingFanWithLowSpeed.getBtnCeilingFan().setText("Quạt trần - số 1");
		ceilingFanWithLowSpeed.getBtnCeilingFan().setBounds(10, 172, 204, 40);
		panelConcreteCommand.add(ceilingFanWithLowSpeed.getBtnCeilingFan());
		
		
		addMouseListenerForEachConcreteCommand();
		addActionListenerForEachRadioButton();

	}

	private void addMouseListenerForEachConcreteCommand() {

		livingRoomLight.addMouseListenerForButtonLight(livingRoomLight, "Đèn phòng khách", "livingRoomLight",
				remoteControl, panelSlotConcreteCommand);

		ceilingFanWithHighSpeed.addMouseListenerForButtonCeilingFan(ceilingFanWithHighSpeed, CeilingFan.HIGH,
				"Quạt trần - số 3", "ceilingFanWithHighSpeed", remoteControl, panelSlotConcreteCommand);
		
		ceilingFanWithMediumSpeed.addMouseListenerForButtonCeilingFan(ceilingFanWithMediumSpeed, CeilingFan.MEDIUM,
				"Quạt trần - số 2", "ceilingFanWithMediumSpeed", remoteControl, panelSlotConcreteCommand);
		
		ceilingFanWithLowSpeed.addMouseListenerForButtonCeilingFan(ceilingFanWithLowSpeed, CeilingFan.LOW,
				"Quạt trần - số 1", "ceilingFanWithMediumSpeed", remoteControl, panelSlotConcreteCommand);

		btnCameraDenPhongKhach.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (cameraLivingRoom.getFrame().isVisible() == true)
					return;
				cameraLivingRoom.initializeCamera();
				cameraLivingRoom.getFrame().setVisible(true);

			}
		});
		btnCameraQuatTran.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (cameraCeilingFan.getFrame().isVisible() == true)
					return;
				cameraCeilingFan.initializeCamera();
				cameraCeilingFan.getFrame().setVisible(true);

			}
		});

	}

	private void addActionListenerForEachRadioButton() {

		for (int i = 0; i < 7; i++) {
			final int tempIndex = i;
			this.remoteControl.getListRadioOn()[i].getRadioButton().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(tempIndex);

					remoteControl.onButtonWasPushed(tempIndex);
					
					// ĐÈN PHÒNG KHÁCH
					if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "livingRoomLight") {
						remoteControl.getOnCommands()[tempIndex].execute();
						if (cameraLivingRoom.getFrame().isShowing() == true) {
							cameraLivingRoom.setTurnLightOn(true);
							cameraLivingRoom.setLightOn();
							cameraLivingRoom.getFrame().revalidate();
							cameraLivingRoom.getFrame().repaint();
						} else {
							cameraLivingRoom.setTurnLightOn(true);
						}

					} 
					
					//QUẠT TRẦN - SÔ 3
					else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "ceilingFanWithHighSpeed") {
						remoteControl.getOnCommands()[tempIndex].execute();
						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanHigh();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanHigh();
						}
					}
					
					//QUẠT TRẦN - SỐ 2 - MEDIUM
					else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "ceilingFanWithMediumSpeed") {
						remoteControl.getOnCommands()[tempIndex].execute();
						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanMedium();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanMedium();
						}
					} 
					
					//QUẠT TRẦN - SÔ 1 - LOW
					else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "ceilingFanWithLowSpeed") {
						remoteControl.getOnCommands()[tempIndex].execute();
						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanLow();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanLow();
						}
					} else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "") {

					}
				}

			});
			this.remoteControl.getListRadioOff()[i].getRadioButton().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "livingRoomLight") {
						remoteControl.getOffCommands()[tempIndex].execute();
						if (cameraLivingRoom.getFrame().isShowing() == true) {

							cameraLivingRoom.setTurnLightOn(false);
							cameraLivingRoom.setLightOff();
							cameraLivingRoom.getFrame().revalidate();
							cameraLivingRoom.getFrame().repaint();
						} else {
							cameraLivingRoom.setTurnLightOn(false);
						}

					} else if (panelSlotConcreteCommand.getComponent(tempIndex)
							.getName() == "ceilingFanWithHighSpeed") {

						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanOff();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanOff();
						}

					} else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "ceilingFanWithMediumSpeed") {
						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanOff();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanOff();
						}
					} else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "ceilingFanWithLowSpeed") {
						if (cameraCeilingFan.getFrame().isShowing() == true) {
							cameraCeilingFan.setCeilingFanOff();
							cameraCeilingFan.getFrame().revalidate();
							cameraCeilingFan.getFrame().repaint();
						} else {
							cameraCeilingFan.setCeilingFanOff();
						}
						
						
					} else if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "") {

					}

				}

			});
		}

	}

	public JPanel getPanelConcreteCommand() {
		return panelConcreteCommand;
	}

	public void setPanelConcreteCommand(JPanel panelConcreteCommand) {
		this.panelConcreteCommand = panelConcreteCommand;
	}

	public JPanel getPanelSlotConcreteCommand() {
		return panelSlotConcreteCommand;
	}

	public void setPanelSlotConcreteCommand(JPanel panelSlotConcreteCommand) {
		this.panelSlotConcreteCommand = panelSlotConcreteCommand;
	}

	public JPanel getPanelRemoteControl() {
		return panelRemoteControl;
	}

	public void setPanelRemoteControl(JPanel panelRemoteControl) {
		this.panelRemoteControl = panelRemoteControl;
	}

	public JPanel getPanelOnOfButton() {
		return panelOnOfButton;
	}

	public void setPanelOnOfButton(JPanel panelOnOfButton) {
		this.panelOnOfButton = panelOnOfButton;
	}
}
