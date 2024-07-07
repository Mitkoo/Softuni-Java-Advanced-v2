package Stacks;

import java.util.*;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrStrings = Arrays.stream(scanner.nextLine().split("\\s+")).toArray(String[]::new);

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,arrStrings);

        while (stack.size() > 1){
            int firstNum = Integer.valueOf(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.valueOf(stack.pop());

            switch (operator){
                case "+":
                    stack.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNum - secondNum));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
