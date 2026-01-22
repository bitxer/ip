import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main Shade class
 */
public class Shade {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
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
                    t = tasks.get(Integer.parseInt(words[1]) - 1);
                    t.mark(words[0].equals("mark"));
                    System.out.println(words[0].equals("mark")
                            ? "Nice! I've marked this task as done:"
                            : "OK, I've marked this task as not done yet:");
                    System.out.println("  " + t);
                    break;
                case "list":
                    if (words.length == 1) {
                        Shade.list();
                        break;
                    }
                default:
                    tasks.add(new Task(inp));
                    System.out.println("added: " + inp);
            }
        }
        System.out.println("Bye. Hope to see you again soon!\n");
    }

    private static void list() {
        int i = 1;
        for (Task t: tasks) {
            System.out.println((i) + "." + t);
            i++;
        }
    }
}
