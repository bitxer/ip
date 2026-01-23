package shadebot.commands;

import shadebot.tasks.DeadlineTask;
import shadebot.tasks.Task;

import java.util.ArrayList;

public class DeadlineCommand extends Command {
    private final String by;

    public DeadlineCommand(String task, String by) {
        super(task);
        this.by = by;
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        Task t = new DeadlineTask(this.getArgs(), this.by);
        return super.add(tasks, t);
    }
}
