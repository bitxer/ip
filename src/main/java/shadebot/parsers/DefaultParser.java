package shadebot.parsers;

import shadebot.commands.*;
import shadebot.exceptions.InsufficientArgumentException;
import shadebot.exceptions.UnknownCommandException;

public class DefaultParser implements Parser {

    @Override
    public Command parse(String inp) {
        String[] words = inp.strip().split(" ", 2);
        switch (words[0]) {
            case "mark":
            case "unmark":
                return new MarkCommand(this.getArg(words), words[0].equals("mark"));
            case "list":
                return new ListCommand();
            case "todo":
                return new TodoCommand(this.getArg(words));
            case "deadline":
                return new DeadlineParser().parse(this.getArg(words));
            case "event":
                return new EventParser().parse(this.getArg(words));
            case "delete":
                return new DeleteCommand(this.getArg(words));
        }
        throw new UnknownCommandException("OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

    private String getArg(String[] inp) {
        if (inp.length < 2) {
            throw new InsufficientArgumentException(String.format("Insufficient arguments provided for %s", inp[0]));
        }
        return inp[1];
    }
}
