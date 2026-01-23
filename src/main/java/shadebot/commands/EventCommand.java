package shadebot.commands;

import shadebot.tasks.EventTask;
import shadebot.tasks.Task;

import java.util.ArrayList;

public class EventCommand extends Command {
    private final String from;
    private final String to;

    public EventCommand(String task, String from, String to) {
        super(task);
        this.from = from;
        this.to = to;
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        Task t = new EventTask(this.getArgs(), this.from, this.to);
        return super.add(tasks, t);
    }
}