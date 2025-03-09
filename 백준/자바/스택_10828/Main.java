package 스택_10828;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input; i++) {
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            String s = split[0];

            if (s.equals("push")) {
                stack.push(Integer.valueOf(split[1]));
            } else {
                System.out.println(run(s,stack));
            }
        }
    }

    private static int run(String s,Deque<Integer> stack) {

        switch (s) {
            case "top": {
                if(stack.isEmpty()) return -1;
                else return stack.getFirst();
            }
            case "empty" : {
                if (stack.isEmpty()) return 1;
                else return 0;
            }
            case "size" : {
                return stack.size();
            }
            default : {
                if (stack.isEmpty()) return -1;
                else return stack.pop();
            }
        }
    }

}