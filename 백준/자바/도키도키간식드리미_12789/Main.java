package 도키도키간식드리미_12789;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        String s = br.readLine();
        int n = Integer.parseInt(s);

        String s1 = br.readLine();
        String[] split = s1.split(" ");
        Queue<Integer> queue = new ArrayDeque<>();
        for (String string : split) {
            queue.offer(Integer.parseInt(string));
        }

        for (int i = 1; i <= n; i++) {
            while (true) {
                if (!stack.isEmpty() && stack.peek() == i) {
                    stack.pop();
                    break;
                }
                else if (!queue.isEmpty() && queue.peek() == i) {
                    queue.poll();
                    break;
                } else if (!queue.isEmpty()){
                    stack.push(queue.poll());
                } else {
                    bw.write("Sad\n");
                    bw.close();
                    return;
                }

            }
        }
        bw.write("Nice\n");
        bw.close();
    }

}
