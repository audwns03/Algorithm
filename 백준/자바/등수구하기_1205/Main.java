package 등수구하기_1205;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = scanner.nextInt();
        int score = scanner.nextInt();
        int maxCnt = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            deque.push(scanner.nextInt());
        }

        while (true) {
            if (deque.isEmpty()) break;

            Integer peek = deque.peek();
            if (peek >= score) {
                deque.push(score);
                break;
            }

            deque.pop();
        }

        if (deque.size() > maxCnt) {
            System.out.println(-1);
            return;
        }
        int rank = 0;
        int check = 0;
        int previous = 0;

        int size = deque.size();
        if (size == 0) rank++;
        for (int i = 0; i < size; i++) {
            Integer poll = deque.pollLast();
            if (i != 0 && previous == poll) {
                check++;
            } else {
                if (check != 0) {
                    rank += check;
                }
                rank++;
                previous = poll;
                check = 0;
            }

        }
        System.out.println(rank);

    }
}
