package concretecommand;

import command.Command;
import receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {
	
	CeilingFan ceilingFan;

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super();
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
