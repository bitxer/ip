package shadebot.commands;

import shadebot.tasks.Task;
import shadebot.tasks.TodoTask;

import java.util.ArrayList;

public abstract class Command {
    private final String args;

    public Command(String args) {
        this.args = args;
    }

    protected String getArgs() {
        return this.args;
    }

    protected String add(ArrayList<Task> tasks, Task t) {
        tasks.add(t);
        return("Got it. I've added this task:\n" +
                "  " + t + "\n" +
                "Now you have " + tasks.size() + " tasks in the list.");
    }

    public abstract String execute(ArrayList<Task> tasks);
}
