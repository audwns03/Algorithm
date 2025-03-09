package 인사성밝은곰곰이_25192;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        Set<String> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                set.clear();
                continue;
            }
            if (set.contains(input)) {
                continue;
            }
            set.add(input);
            result++;
        }

        bw.write(result + "\n");
        bw.close();
    }
}
