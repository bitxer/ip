package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public class DeleteCommand extends Command {
    public DeleteCommand(String args) {
        super(args);
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        int idx = Integer.parseInt(this.getArgs()) - 1;
        Task t = tasks.get(idx);
        tasks.remove(idx);
        return "Noted. I've removed this task:\n" +
                "  " + t + "\n" +
                "Now you have " + tasks.size() + " tasks in the list.";
    }
}