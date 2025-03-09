package 제로_10773;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if(input == 0) {
                stack.pop();
                continue;
            }
            stack.push(input);

        }

        int cnt = 0;
        for (Integer i : stack) {
            cnt += i;
        }
        System.out.println(cnt);
    }
}
