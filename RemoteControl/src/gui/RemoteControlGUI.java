package gui;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;

import client.RemoteControl;
import command.NoCommand;
import concretecommand.LightOffCommand;
import concretecommand.LightOnCommand;
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

		JLabel lblNewLabel_1 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel_6);

		JLabel lblNewLabel = new JLabel("labelHoldPosition");
		panelSlotConcreteCommand.add(lblNewLabel);

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

		addMouseListenerForEachConcreteCommand();
		addActionListenerForEachRadioButton();

	}

	private void addMouseListenerForEachConcreteCommand() {
		livingRoomLight.getBtnLight().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (livingRoomLight.isSelectedLight() == false) {
					livingRoomLight.setSelectedLight(true);
					livingRoomLight.getBtnLightInRemoteControl().setText("Đèn phòng khách");
					livingRoomLight.getBtnLightInRemoteControl().setName("livingRoomLight");

					LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
					LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

					int indexNeedToAddRemote = remoteControl.getIndexOfLastSlot();
					livingRoomLight.setIndexOfPanelSlotRemoteControl(indexNeedToAddRemote);

					remoteControl.setCommand(indexNeedToAddRemote, livingRoomLightOnCommand, livingRoomLightOffCommand);

					panelSlotConcreteCommand.remove(indexNeedToAddRemote); // remove label hold position

					panelSlotConcreteCommand.add(livingRoomLight.getBtnLightInRemoteControl(), indexNeedToAddRemote);
					panelSlotConcreteCommand.revalidate();
					panelSlotConcreteCommand.repaint();
					System.out.println("chon den phong khach");

				} else {
					livingRoomLight.setSelectedLight(false);
					/// remoteControl.setCommand(slot, onCommand, offCommand);
					remoteControl.setCommand(livingRoomLight.getIndexOfPanelSlotRemoteControl(), new NoCommand(),
							new NoCommand());
					int indexNeedToRemove = livingRoomLight.getIndexOfPanelSlotRemoteControl();

					panelSlotConcreteCommand.remove(livingRoomLight.getBtnLightInRemoteControl());
					JLabel labelHoldPosition = new JLabel("labelHoldPosition");
					panelSlotConcreteCommand.add(labelHoldPosition, indexNeedToRemove);
					panelSlotConcreteCommand.revalidate();
					panelSlotConcreteCommand.repaint();
					System.out.println("huy chon den phong khach");
				}
			}
		});

		btnCameraDenPhongKhach.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				cameraLivingRoom.initializeCamera();
				cameraLivingRoom.getFrame().setVisible(true);
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

					if (panelSlotConcreteCommand.getComponent(tempIndex).getName() == "livingRoomLight") {
						remoteControl.getOnCommands()[tempIndex].execute();
						if (cameraLivingRoom.getFrame().isShowing() == true) {
							cameraLivingRoom.setTurnLightOn(true);
							cameraLivingRoom.getLabelImageLivingRoom().setIcon(new ImageIcon(
									CameraLivingRoom.class.getResource("/image/living-room-light-on.jpeg")));
							cameraLivingRoom.getFrame().revalidate();
							cameraLivingRoom.getFrame().repaint();
						} else {
							cameraLivingRoom.setTurnLightOn(true);
						}

					} else {
						System.out.println(panelSlotConcreteCommand.getComponent(tempIndex).getName());
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
							cameraLivingRoom.getLabelImageLivingRoom().setIcon(new ImageIcon(
									CameraLivingRoom.class.getResource("/image/living-room-light-off.jpeg")));
							cameraLivingRoom.getFrame().revalidate();
							cameraLivingRoom.getFrame().repaint();
						} else {
							cameraLivingRoom.setTurnLightOn(false);
						}

					} else {
					}

				}

			});
		}

	}
}
