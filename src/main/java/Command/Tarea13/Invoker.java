package Command.Tarea13;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommandPlay> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(ICommandPlay concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommands(){
        for (ICommandPlay command: commandList) {
            command.execute();
        }
        commandList.clear();
    }
}

