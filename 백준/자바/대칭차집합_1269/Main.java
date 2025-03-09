package 대칭차집합_1269;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] split = s.split(" ");

        Set<Integer> inputA = getInput(Integer.parseInt(split[0]));
        Set<Integer> inputB = getInput(Integer.parseInt(split[1]));
        bw.write(run(inputA, inputB) + "\n");
        bw.close();
    }

    private static int run(Set<Integer> a, Set<Integer> b) {
        int result = 0;

        for (Integer i : a) {
            if (!b.contains(i)) result++;
        }

        for (Integer i : b) {
            if (!a.contains(i)) result++;
        }

        return result;
    }

    private static Set<Integer> getInput(int n) throws IOException {
        Set<Integer> set = new HashSet<>();

        String s = br.readLine();
        String[] split = s.split(" ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(split[i]));
        }

        return set;
    }
}
