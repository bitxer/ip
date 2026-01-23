package shadebot.tasks;

public class EventTask extends Task {
    private final char TYPE = 'E';
    private final String from;
    private final String to;

    public EventTask(String task, String from, String to) {
        super(task);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("[%s]%s (from: %s to: %s)", this.TYPE, super.toString(), this.from, this.to);
    }
}
