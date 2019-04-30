package concretecommand;

import command.Command;
import receiver.Light;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
