package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public interface Command {
    public String execute(ArrayList<Task> tasks);
}
