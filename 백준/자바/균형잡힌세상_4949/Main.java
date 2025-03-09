package 균형잡힌세상_4949;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }

            String[] split = s.split("");
            boolean result = isBalance(split);
            if (result) bw.write("yes\n");
            else bw.write("no\n");
        }

        bw.close();
    }

    private static boolean isBalance(String[] arr) {
        Deque<String> deque = new ArrayDeque<>();

        for (String s : arr) {
            if (s.equals("[") || s.equals("(")) {
                deque.push(s);
            } else if (s.equals(")") || s.equals("]")) {
                if (deque.isEmpty()) return false;
                if ((deque.peek().equals("(") && s.equals("]")) || (deque.peek().equals("[") && s.equals(")"))) {
                    return false;
                }
                deque.pop();
            }
        }

        if (deque.isEmpty()) return true;
        else return false;
    }

}
