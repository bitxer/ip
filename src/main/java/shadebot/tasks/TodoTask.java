package shadebot.tasks;

public class TodoTask extends Task {
    private final char TYPE = 'T';
    public TodoTask(String task) {
        super(task);
    }

    public TodoTask(String task, boolean isDone) {
        super(task, isDone);
    }

    @Override
    public String toString() {
        return String.format("  [%s]%s", this.TYPE, super.toString());
    }
}
