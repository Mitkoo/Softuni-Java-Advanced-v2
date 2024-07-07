package Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;

public class ReverseNumbersWithAStack_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i: numbers){
            stack.push(i);
        }

        for (int i: stack){
            System.out.print(stack.pop() + " ");
        }
    }
}
