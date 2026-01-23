package shadebot.parsers;

import shadebot.commands.Command;

public interface Parser {
    public Command parse(String inp);
}
