package 서로다른부분문자열개수_11478;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();
        String s = br.readLine();
        String[] split = s.split("");

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(split[j]);
                if (set.contains(String.valueOf(sb))) continue;
                set.add(sb.toString());
            }
        }

        bw.write(set.size() + "\n");
        bw.close();
    }

}
