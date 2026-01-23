package shadebot;

import shadebot.parsers.DefaultParser;
import shadebot.tasks.Task;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main shadebot.Shade class
 */
public class Shade {
    private final ArrayList<Task> tasks;

    public Shade(ArrayList<Task> storage) {
        this.tasks = storage;
    }

    public void run() {
        String logo = "   _____ _               _      \n" +
                "  / ____| |             | |     \n" +
                " | (___ | |__   __ _  __| | ___ \n" +
                "  \\___ \\| '_ \\ / _` |/ _` |/ _ \\\n" +
                "  ____) | | | | (_| | (_| |  __/\n" +
                " |_____/|_| |_|\\__,_|\\__,_|\\___|\n";
        System.out.println("Hello! I'm \n" + logo);
        System.out.println("What can I do for you?\n");

        Scanner s = new Scanner(System.in);
        for (String inp = s.nextLine().strip(); !inp.equals("bye"); inp = s.nextLine().strip()) {
            System.out.println(new DefaultParser().parse(inp).execute(this.tasks));
        }
        System.out.println("Bye. Hope to see you again soon!\n");
    }

    public static void main(String[] args) {
        new Shade(new ArrayList<>()).run();
    }

}
