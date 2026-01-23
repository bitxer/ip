package shadebot.parsers;

import shadebot.commands.Command;
import shadebot.commands.EventCommand;

public class EventParser implements Parser {
    @Override
    public Command parse(String inp) {
        String[] args = inp.split(" /from ", 2);
        String task = args[0].strip();
        args = args[1].split(" /to ");
        String from = args[0].strip();
        String to = args[1].strip();
        return new EventCommand(task, from, to);
    }
}
