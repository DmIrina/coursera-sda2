package CommandPattern;

//Invoker
// singleton))
public class CommandManager {
    private static CommandManager uniqueInstance = null;

    private CommandManager(){
        //...
    }

    public static CommandManager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CommandManager();
        }
        return uniqueInstance;
    }

    public void invokeCommand(Command command){
        command.execute();
    }

    public void undo(Command command){
        if (command.isReversible()){
            command.unexecute();
        }
    }

}
