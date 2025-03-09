package 괄호_9012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < input; i++) {
            Deque<Character> deque = new ArrayDeque<>();
            String s = scanner.nextLine();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                deque.offer(c);
            }
            if (run(deque)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    private static boolean run(Deque<Character> deque) {
        Deque<Character> stack = new ArrayDeque<>();
        while (!deque.isEmpty()) {
            Character now = deque.poll();
            if (stack.isEmpty() && now == ')') return false;

            if (now == '(') stack.push(now);
            else stack.pop();
        }
        return stack.isEmpty();
    }
}