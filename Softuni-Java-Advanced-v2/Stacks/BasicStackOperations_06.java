package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .mapToInt(Integer::parseInt)
                                                                .toArray();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .mapToInt(Integer::parseInt)
                                                                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int N = parameters[0];
        int S = parameters[1];
        int X = parameters[2];

        for (int i = 0; i < N; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println("0");
        } else if (stack.contains(X)) {
            System.out.println("true");
        } else {
            int min = stack.getFirst();
            for (int i: stack){
                if (i < min){
                    min = i;
                }
            }
            System.out.println(min);
        }
    }
}
