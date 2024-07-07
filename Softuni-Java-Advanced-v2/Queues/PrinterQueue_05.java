package Queues;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")) {

            if (!input.equals("cancel")){
                queue.offer(input);
            } else {
                Optional<String> itemToRemove = Optional.ofNullable(queue.poll());
                if (!itemToRemove.isPresent()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + itemToRemove.get());
                }
            }
            input = scanner.nextLine();
        }
        for (String queueItem : queue) {
            System.out.println(queueItem);
        }
    }
}
