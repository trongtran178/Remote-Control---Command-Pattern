package utils;

import javax.swing.JRadioButton;

public class RadioButton {

	private JRadioButton radioButton;

	private int index;

	public RadioButton() {
		super();
		this.radioButton = new JRadioButton();
	}

	public RadioButton(JRadioButton radioButton, int index) {
		super();
		this.radioButton = radioButton;
		this.index = index;
	}

	public JRadioButton getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(JRadioButton radioButton) {
		this.radioButton = radioButton;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
