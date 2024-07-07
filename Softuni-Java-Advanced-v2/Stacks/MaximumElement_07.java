package Stacks;
import java.util.*;
public class MaximumElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int[] inLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                    .mapToInt(Integer::parseInt)
                                                                    .toArray();

                if (inLine[0] == 1){
                    stack.push(inLine[1]);
                } else if (inLine[0] == 2) {
                    stack.pop();
                } else {
                    int max = stack.getFirst();
                    for (int j: stack){
                        if (j > max){
                            max = j;
                        }
                    }
                    System.out.println(max);
                }
        }
    }
}
