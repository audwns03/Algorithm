package 신나는함수실행_9184;

import java.io.*;

public class Main {

    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("-1 -1 -1")) {
                break;
            }
            String[] split = s.split(" ");

            int result = run(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            StringBuilder sb = new StringBuilder();
            sb.append("w(").append(split[0]).append(", ").append(split[1]).append(", ").append(split[2]).append(") = ").append(result);
            System.out.println(sb);
        }

    }

    static int run(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return run(20, 20, 20);
        }
        if (dp[a][b][c] > 0) {
            return dp[a][b][c];
        }

        if (a < b && b < c) {
            dp[a][b][c] = run(a, b, c - 1) + run(a, b - 1, c - 1) - run(a, b - 1, c);
            return dp[a][b][c];
        }

        dp[a][b][c] = run(a - 1, b, c) + run(a - 1, b - 1, c) + run(a - 1, b, c - 1) - run(a - 1, b - 1, c - 1);
        return dp[a][b][c];
    }
}
