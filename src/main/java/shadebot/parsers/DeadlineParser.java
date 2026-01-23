package shadebot.parsers;

import shadebot.commands.Command;
import shadebot.commands.DeadlineCommand;

public class DeadlineParser implements Parser {
    @Override
    public Command parse(String inp) {
        String[] args = inp.split(" /by ", 2);
        return new DeadlineCommand(args[0].strip(), args[1].strip());
    }
}
