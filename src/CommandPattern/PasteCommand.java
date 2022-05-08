package CommandPattern;

public class PasteCommand extends Command {
    private Document document;
    private int position;
    private String text;

    public PasteCommand(Document document, int position, String text) {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    @Override
    public void execute() {
        document.insertText(position, text);
    }

    @Override
    public void unexecute() {
        document.deleteText(position, text.length());
    }

    @Override
    public boolean isReversible() {
        return true;
    }
}
