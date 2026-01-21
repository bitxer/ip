import java.util.Scanner;

/**
 * Main Shade class
 */
public class Shade {
    public static void main(String[] args) {
        String logo = "   _____ _               _      \n" +
                "  / ____| |             | |     \n" +
                " | (___ | |__   __ _  __| | ___ \n" +
                "  \\___ \\| '_ \\ / _` |/ _` |/ _ \\\n" +
                "  ____) | | | | (_| | (_| |  __/\n" +
                " |_____/|_| |_|\\__,_|\\__,_|\\___|\n";
        System.out.println("Hello! I'm \n" + logo);
        System.out.println("What can I do for you?\n");
        String str = "";
        for (Scanner s = new Scanner(System.in);
             !str.equals("bye");
             str = s.nextLine()) {
            System.out.println(str);
        }
        System.out.println("Bye. Hope to see you again soon!\n");
    }
}
