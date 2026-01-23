package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public abstract class Command {
    private final String args;

    public Command(String args) {
        this.args = args;
    }

    protected String getArgs() {
        return this.args;
    }
    public abstract String execute(ArrayList<Task> tasks);
}
