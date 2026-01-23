package shadebot.commands;

import shadebot.tasks.Task;
import shadebot.tasks.TodoTask;

import java.util.ArrayList;

public class TodoCommand extends Command{
    public TodoCommand(String args) {
        super(args);
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        Task t = new TodoTask(this.getArgs());
        tasks.add(t);
        return("Got it. I've added this task:\n" +
                "  " + t + "\n" +
                "Now you have " + tasks.size() + " tasks in the list.");
    }
}
