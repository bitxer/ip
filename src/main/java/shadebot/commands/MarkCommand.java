package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public class MarkCommand extends Command {
    private final boolean isMark;
    public MarkCommand(String args, boolean isMark) {
        super(args);
        this.isMark = isMark;
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        int idx = Integer.parseInt(this.getArgs());
        Task t = tasks.get(idx - 1);
        t.mark(this.isMark);
        return (this.isMark
                ? "Nice! I've marked this task as done:"
                : "OK, I've marked this task as not done yet:")
                + "\n  " + t;
    }
}
