package 스택2_28278;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        String s = br.readLine();
        int n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            String[] split = s1.split(" ");
            int input = Integer.parseInt(split[0]);

            switch (input) {
                case 1 -> {
                    int num = Integer.parseInt(split[1]);
                    stack.push(num);
                }
                case 2 -> {
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                        continue;
                    }

                    Integer pop = stack.pop();
                    bw.write(pop + "\n");
                }
                case 3 -> {
                    bw.write(stack.size() + "\n");
                }
                case 4 -> {
                    if (stack.isEmpty()) {
                        bw.write(1 + "\n");
                    } else bw.write(0 + "\n");
                }
                case 5 -> {
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                        continue;
                    }

                    Integer peek = stack.peek();
                    bw.write(peek + "\n");
                }
            }
        }

        bw.close();
    }

}
