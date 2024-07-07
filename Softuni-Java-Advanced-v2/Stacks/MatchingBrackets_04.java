package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] stringArray = input.toCharArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int index = 0;

        for (char c : stringArray) {
            if (c == '('){
              stack.push(index);
            } else if (c == ')') {
                int startIndex = stack.pop();
                String contents = input.substring(startIndex, index + 1);
                System.out.println(contents);
            }
            index++;
        }
    }
}
