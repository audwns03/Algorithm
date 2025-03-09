package 파도반수열_9461;

import java.io.*;

public class Main {

    static long[] dp = new long[102];
    static int now = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;
        dp[5] = 2L;


        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            int input = Integer.parseInt(s1);

            if (dp[input] == 0L){
                run(input);
            }


            bw.write(dp[input] + "\n");
        }
        bw.close();
    }

    static void run(int n) {
        for (int i = now; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }
    }
}
