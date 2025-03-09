package 붙임성좋은총총이_26069;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");

            if (set.contains(split[0])) {
                set.add(split[1]);
            } else if (set.contains(split[1])) {
                set.add(split[0]);
            }
        }

        bw.write(set.size() + "\n");
        bw.close();
    }
}
