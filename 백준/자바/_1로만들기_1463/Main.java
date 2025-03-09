package _1로만들기_1463;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] dp = new int[n + 1];

        dp[n] = 0;
        for (int i = n; i > 1; i--) {
            if (i % 3 == 0 && (dp[i / 3] == 0 || dp[i / 3] > dp[i] + 1)) {
                dp[i / 3] = dp[i] + 1;
            }
            if (i % 2 == 0 && (dp[i / 2] == 0 || dp[i / 2] > dp[i] + 1)) {

                dp[i / 2] = dp[i] + 1;
            }
            if (dp[i - 1] == 0 || dp[i - 1] > dp[i] + 1) {
                dp[i - 1] = dp[i] + 1;
            }
        }

        System.out.println(dp[1]);
    }
}
