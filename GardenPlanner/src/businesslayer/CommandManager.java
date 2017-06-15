package businesslayer;

import java.util.Stack;

public class CommandManager {

	private Stack commandStack = new Stack();
	
    public void ExecuteCommand(Command cmd)
    {
        cmd.Execute();
        commandStack.push(cmd);
   
    }


    public void Undo()
    {
            Command cmd = (Command) commandStack.pop();
            cmd.Undo();
    }
}
