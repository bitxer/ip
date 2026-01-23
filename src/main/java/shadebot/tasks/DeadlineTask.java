package shadebot.tasks;

public class DeadlineTask extends Task {
    private final char TYPE = 'D';
    private final String by;

    public DeadlineTask(String task, String by) {
        super(task);
        this.by = by;
    }

    @Override
    public String toString() {
        return String.format("[%s]%s (by: %s)", this.TYPE, super.toString(), this.by);
    }
}
