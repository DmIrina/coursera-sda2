package CommandPattern;

public abstract class Command {
    public abstract void execute();
    public abstract void unexecute();
    public abstract boolean isReversible();
}
