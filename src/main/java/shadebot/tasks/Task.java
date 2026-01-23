package shadebot.tasks;

/**
 * shadebot.Task class file
 */
public class Task {
    private final String task;
    private boolean isDone;

    public Task(String task) {
        this(task, false);
    }

    public Task(String task, boolean isDone) {
        this.task = task;
        this.isDone = isDone;
    }

    public void mark(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "[" + (this.isDone ? "X" : " ") + "] " + this.task;
    }
}
