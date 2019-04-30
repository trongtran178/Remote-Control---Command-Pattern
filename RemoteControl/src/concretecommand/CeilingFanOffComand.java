package concretecommand;

import command.Command;
import receiver.CeilingFan;

public class CeilingFanOffComand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOffComand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
