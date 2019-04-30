package concretecommand;

import command.Command;
import receiver.CeilingFan;

public class CeilingFanMediumCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
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
