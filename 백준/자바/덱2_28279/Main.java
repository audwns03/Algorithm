package 덱2_28279;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        String s = br.readLine();
        int n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            String[] split = s1.split(" ");
            int input = Integer.parseInt(split[0]);

            switch (input) {
                case 1 -> {
                    deque.offerFirst(Integer.parseInt(split[1]));
                }
                case 2 -> {
                    deque.offerLast(Integer.parseInt(split[1]));
                }
                case 3 -> {
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");

                    }
                }
                case 4 -> {
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");

                    }
                }
                case 5 -> {
                    bw.write(deque.size() + "\n");
                }
                case 6 -> {
                    if (deque.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                }
                case 7 -> {
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                }
                case 8 -> {
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                }
            }

        }
        bw.close();
    }

}
