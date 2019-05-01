package receiver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import command.NoCommand;
import concretecommand.LightOffCommand;
import concretecommand.LightOnCommand;
import invoker.RemoteControl;

public class Light {

	String location;

	JButton btnLight;

	JButton btnLightInRemoteControl;

	private boolean isSelectedLight;

	private int indexOfPanelSlotRemoteControl;

	public Light() {
		this.btnLight = new JButton();
		this.btnLightInRemoteControl = new JButton();
		this.isSelectedLight = false;
	}

	public Light(String location) {
		this.location = location;
		this.btnLight = new JButton();
		this.btnLightInRemoteControl = new JButton();
		this.isSelectedLight = false;
	}

	public void addMouseListenerForButtonLight(Light light, String textOfButton, String nameOfButton,
			RemoteControl remoteControl, JPanel panelSlotConcreteCommand) {
		light.getBtnLight().addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if (light.isSelectedLight == false) {
					light.setSelectedLight(true);
					light.getBtnLightInRemoteControl().setText(textOfButton);
					light.getBtnLightInRemoteControl().setName(nameOfButton);

					LightOnCommand lightOnCommand = new LightOnCommand(light);
					LightOffCommand lightOffCommand = new LightOffCommand(light);
					int indexNeedToAddRemote = remoteControl.getIndexNeedToAdd();
					light.setIndexOfPanelSlotRemoteControl(indexNeedToAddRemote);
					remoteControl.setCommand(indexNeedToAddRemote, lightOnCommand, lightOffCommand);

					panelSlotConcreteCommand.remove(indexNeedToAddRemote); // remove label hold
					panelSlotConcreteCommand.add(light.getBtnLightInRemoteControl(), indexNeedToAddRemote);
					panelSlotConcreteCommand.revalidate();
					panelSlotConcreteCommand.repaint();
				} else {
					light.setSelectedLight(false);
					remoteControl.setCommand(light.getIndexOfPanelSlotRemoteControl(), new NoCommand(),
							new NoCommand());
					int indexNeedToRemove = light.getIndexOfPanelSlotRemoteControl();

					panelSlotConcreteCommand.remove(light.getBtnLightInRemoteControl());
					JLabel labelHoldPosition = new JLabel(""); // label giữ chỗ
					panelSlotConcreteCommand.add(labelHoldPosition, indexNeedToRemove);
					panelSlotConcreteCommand.revalidate();
					panelSlotConcreteCommand.repaint();
					System.out.println("huy chon den phong khach");
				}
			}
		});
	}

	// action of receiver
	public void on() {

		// truyen cac tham so de bat den
		System.out.println("Turn the light on");
	}

	// action of receiver
	public void off() {
		System.out.println("Turn the light off");
	}

	public int getIndexOfPanelSlotRemoteControl() {
		return indexOfPanelSlotRemoteControl;
	}

	public void setIndexOfPanelSlotRemoteControl(int indexOfPanelSlotRemoteControl) {
		this.indexOfPanelSlotRemoteControl = indexOfPanelSlotRemoteControl;
	}

	public JButton getBtnLightInRemoteControl() {
		return btnLightInRemoteControl;
	}

	public void setBtnLightInRemoteControl(JButton btnLightInRemoteControl) {
		this.btnLightInRemoteControl = btnLightInRemoteControl;
	}

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
}
