package shadebot.parsers;

import jdk.jfr.Event;
import shadebot.commands.*;

public class DefaultParser implements Parser {

    @Override
    public Command parse(String inp) {
        String[] words = inp.strip().split(" ", 2);
        switch (words[0]) {
            case "mark":
            case "unmark":
                return new MarkCommand(words[1], words[0].equals("mark"));
            case "list":
                if (words.length == 1) {
                    return new ListCommand();
                }
            case "todo":
                return new TodoCommand(words[1]);
            case "deadline":
                return new DeadlineParser().parse(words[1]);
            case "event":
                return new EventParser().parse(words[1]);
        }
        return null;
    }
}
