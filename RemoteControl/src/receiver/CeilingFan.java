package receiver;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import command.Command;
import command.NoCommand;
import concretecommand.CeilingFanHighCommand;
import concretecommand.CeilingFanLowCommand;
import concretecommand.CeilingFanMediumCommand;
import concretecommand.CeilingFanOffComand;
import invoker.RemoteControl;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	String location;
	int speed;

	JButton btnCeilingFan;
	JButton btnCeilingFanInRemoteControl;
	private boolean isSelectedCeilingFan;
	private int indexOfPanelSlotRemoteControl;

	public CeilingFan() {
		this.btnCeilingFan = new JButton();
		this.btnCeilingFanInRemoteControl = new JButton();
		this.isSelectedCeilingFan = false;
		this.speed = OFF;
	}

	public CeilingFan(String location) {
		this.location = location;
		this.btnCeilingFan = new JButton();
		this.btnCeilingFanInRemoteControl = new JButton();
		this.isSelectedCeilingFan = false;
		this.speed = OFF;
	}

	public void addMouseListenerForButtonCeilingFan(CeilingFan ceilingFan, int speed, String textOfButton,
			String nameOfButton, RemoteControl remoteControl, JPanel panelSlotOfConcreteCommand) {

		ceilingFan.getBtnCeilingFan().addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {

				if (ceilingFan.isSelectedCeilingFan == false) {
					ceilingFan.isSelectedCeilingFan = true;
					ceilingFan.getBtnCeilingFanInRemoteControl().setText(textOfButton);
					ceilingFan.getBtnCeilingFanInRemoteControl().setName(nameOfButton);

					Command ceillingFanOn = new NoCommand();

					if (speed == HIGH) {
						ceillingFanOn = new CeilingFanHighCommand(ceilingFan);
					} else if (speed == MEDIUM) {
						ceillingFanOn = new CeilingFanMediumCommand(ceilingFan);
					} else if (speed == LOW) {
						ceillingFanOn = new CeilingFanLowCommand(ceilingFan);
					}
					CeilingFanOffComand ceilingFanOff = new CeilingFanOffComand(ceilingFan);

					int indexNeedToAddRemote = remoteControl.getIndexNeedToAdd();
					ceilingFan.setIndexOfPanelSlotRemoteControl(indexNeedToAddRemote);

					remoteControl.setCommand(indexNeedToAddRemote, ceillingFanOn, ceilingFanOff);

					panelSlotOfConcreteCommand.remove(indexNeedToAddRemote); // remove label hold;
					panelSlotOfConcreteCommand.add(ceilingFan.getBtnCeilingFanInRemoteControl(), indexNeedToAddRemote);
					panelSlotOfConcreteCommand.revalidate();
					panelSlotOfConcreteCommand.repaint();
					System.out.println("chon ceiling fan");

				} else {
					ceilingFan.setSelectedCeilingFan(false);
					remoteControl.setCommand(ceilingFan.getIndexOfPanelSlotRemoteControl(), new NoCommand(),
							new NoCommand());
					int indexNeedToRemove = ceilingFan.getIndexOfPanelSlotRemoteControl();
					panelSlotOfConcreteCommand.remove(ceilingFan.getBtnCeilingFanInRemoteControl());
					JLabel labelHoldPosition = new JLabel(""); // label giữ chỗ
					panelSlotOfConcreteCommand.add(labelHoldPosition, indexNeedToRemove);
					panelSlotOfConcreteCommand.revalidate();
					panelSlotOfConcreteCommand.repaint();
					System.out.println("huy chon ceiling fan");

				}

			}

		});

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public JButton getBtnCeilingFan() {
		return btnCeilingFan;
	}

	public void setBtnCeilingFan(JButton btnCeilingFan) {
		this.btnCeilingFan = btnCeilingFan;
	}

	public JButton getBtnCeilingFanInRemoteControl() {
		return btnCeilingFanInRemoteControl;
	}

	public void setBtnCeilingFanInRemoteControl(JButton btnCeilingFanInRemoteControl) {
		this.btnCeilingFanInRemoteControl = btnCeilingFanInRemoteControl;
	}

	public boolean isSelectedCeilingFan() {
		return isSelectedCeilingFan;
	}

	public void setSelectedCeilingFan(boolean isSelectedCeilingFan) {
		this.isSelectedCeilingFan = isSelectedCeilingFan;
	}

	public void high() {
		speed = HIGH;
	}

	public void medium() {
		speed = MEDIUM;
	}

	public void low() {
		speed = LOW;
	}

	public void off() {
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIndexOfPanelSlotRemoteControl() {
		return indexOfPanelSlotRemoteControl;
	}

	public void setIndexOfPanelSlotRemoteControl(int indexOfPanelSlotRemoteControl) {
		this.indexOfPanelSlotRemoteControl = indexOfPanelSlotRemoteControl;
	}

	public static int getHigh() {
		return HIGH;
	}

	public static int getMedium() {
		return MEDIUM;
	}

	public static int getLow() {
		return LOW;
	}

	public static int getOff() {
		return OFF;
	}

}
