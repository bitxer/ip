package shadebot.parsers;

import shadebot.commands.AddCommand;
import shadebot.commands.Command;
import shadebot.commands.ListCommand;
import shadebot.commands.MarkCommand;

public class DefaultParser implements Parser {

    @Override
    public Command parse(String inp) {
        String[] words = inp.strip().split(" ", 2);
        switch (words[0]) {
            case "":
                break;
            case "mark":
            case "unmark":
                return new MarkCommand(words[1], words[0].equals("mark"));
            case "list":
                if (words.length == 1) {
                    return new ListCommand();
                }
            default:
                return new AddCommand(inp);
        }
        return null;
    }
}
