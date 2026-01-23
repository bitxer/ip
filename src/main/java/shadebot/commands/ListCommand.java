package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public class ListCommand extends Command {
    public ListCommand() {
        super("");
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        int i = 1;
        StringBuilder list = new StringBuilder();
        for (Task t: tasks) {
            list.append(i).append(".").append(t).append("\n");
            i++;
        }
        return list.toString();
    }
}
