package command;

import java.util.PriorityQueue;

public class Application {

    public static void main(String[] args) {
        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("A"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABCDE"));
        queue.add(new StringPrintCommand("ABCDEF"));
        queue.add(new StringPrintCommand("ABCDEFG"));
        for (Command command : queue)
            command.execute();
    }

}
