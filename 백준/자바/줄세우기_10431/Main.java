package 줄세우기_10431;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            deque.clear();
            int num = scanner.nextInt();

            for (int j = 0; j < 20; j++) {
                deque.offer(scanner.nextInt());
            }

            run(deque, num);
        }
    }

    private static void run(Deque<Integer> deque, int num) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        while (!deque.isEmpty()) {

            Integer input = deque.poll();
            if (list.isEmpty()) {
                list.add(input);
                continue;
            }

            int size = list.size();
            if (list.get(size - 1) > input) {
                cnt += push(input, list);
            } else {
                list.add(input);
            }
        }

        print(cnt, num);
    }

    private static int push(int input, List<Integer> list) {
        int index = 0;
        for (Integer now : list) {
            if (now > input) {
                index = list.indexOf(now);
                break;
            }
        }
        int result = list.size() - index;
        list.add(index, input);

        return result;
    }

    private static void print(int cnt, int num) {
        System.out.println(num + " " + cnt);
    }
}
