package 연속합_1912;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        String s1 = br.readLine();
        String[] split = s1.split(" ");

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += Integer.parseInt(split[i]);
            if (cnt > max) max = cnt;
            if (cnt < 0) cnt = 0;
        }

        System.out.println(max);
    }
}
