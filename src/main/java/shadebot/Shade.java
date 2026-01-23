package shadebot;

import shadebot.tasks.Task;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main shadebot.Shade class
 */
public class Shade {
    private final ArrayList<Task> storage;

    public Shade(ArrayList<Task> storage) {
        this.storage = storage;
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
            String[] words = inp.split(" ");
            Task t;
            switch (words[0]) {
                case "":
                    break;
                case "mark":
                case "unmark":
                    t = this.storage.get(Integer.parseInt(words[1]) - 1);
                    t.mark(words[0].equals("mark"));
                    System.out.println(words[0].equals("mark")
                            ? "Nice! I've marked this task as done:"
                            : "OK, I've marked this task as not done yet:");
                    System.out.println("  " + t);
                    break;
                case "list":
                    if (words.length == 1) {
                        this.list();
                        break;
                    }
                default:
                    this.storage.add(new Task(inp));
                    System.out.println("added: " + inp);
            }
        }
        System.out.println("Bye. Hope to see you again soon!\n");
    }

    private void list() {
        int i = 1;
        for (Task t: this.storage) {
            System.out.println((i) + "." + t);
            i++;
        }
    }

    public static void main(String[] args) {
        new Shade(new ArrayList<>()).run();
    }

}
