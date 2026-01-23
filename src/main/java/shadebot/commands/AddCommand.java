package shadebot.commands;

import shadebot.tasks.Task;

import java.util.ArrayList;

public class AddCommand extends Command{
    public AddCommand(String args) {
        super(args);
    }

    @Override
    public String execute(ArrayList<Task> tasks) {
        tasks.add(new Task(this.getArgs()));
        return("added: " + this.getArgs());
    }
}
