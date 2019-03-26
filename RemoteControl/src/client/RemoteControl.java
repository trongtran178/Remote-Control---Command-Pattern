package client;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import command.Command;
import command.NoCommand;
import utils.RadioButton;

public class RemoteControl {
	Command[] onCommands;

	Command[] offCommands;
	
	//radiobutton tu dinh nghia o day
	RadioButton[] listRadioOn;
	RadioButton[] listRadioOff;

	ButtonGroup[] listRadioButtonGroup;

	public ButtonGroup[] getListRadioButtonGroup() {
		return listRadioButtonGroup;
	}

	public void setListRadioButtonGroup(ButtonGroup[] listRadioButtonGroup) {
		this.listRadioButtonGroup = listRadioButtonGroup;
	}

	public RadioButton[] getListRadioOn() {
		return listRadioOn;
	}

	public void setListRadioOn(RadioButton[] listRadioOn) {
		this.listRadioOn = listRadioOn;
	}

	public RadioButton[] getListRadioOff() {
		return listRadioOff;
	}

	public void setListRadioOff(RadioButton[] listRadioOff) {
		this.listRadioOff = listRadioOff;
	}

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		listRadioOn = new RadioButton[7];
		listRadioOff = new RadioButton[7];
		listRadioButtonGroup = new ButtonGroup[7];
		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
			listRadioOn[i] = new RadioButton();
			listRadioOff[i] = new RadioButton();
			
		}

		for (int i = 0; i < 7; i++) {
			listRadioButtonGroup[i] = new ButtonGroup();
			listRadioOn[i].getRadioButton().setText("On");
			listRadioOn[i].setIndex(i);
			
			listRadioOff[i].getRadioButton().setText("Off");
			listRadioOff[i].setIndex(i);
			this.listRadioButtonGroup[i].add(listRadioOn[i].getRadioButton());
			this.listRadioButtonGroup[i].add(listRadioOff[i].getRadioButton());
		}

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public int getIndexOfLastSlot() {
		int i = 0;
		for (; i < this.onCommands.length; i++) {
			if (this.onCommands[i].getClass().getTypeName() == "command.NoCommand") {
				return i - 1;
			}
		}
		return -1;
	}

}
