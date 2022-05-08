package CommandPattern;

public class Editor {

    public void edit(Document aDocument, int aPosition, String AText){
        CommandManager commandManager = CommandManager.getInstance();
        Command pasteCommand = new PasteCommand(aDocument, aPosition, AText);
        commandManager.invokeCommand(pasteCommand);
        // ctrl z
        commandManager.undo(pasteCommand);
    }
}
