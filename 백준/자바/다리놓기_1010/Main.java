package 다리놓기_1010;

import java.io.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            long result = run(Long.parseLong(split[0]), Long.parseLong(split[1]));
            bw.write(result + "\n");
            bw.flush();
        }
        bw.close();
    }

    private static long run(long a, long b) {
        if (a == b) return 1;
        long n = 0L;
        long m = 0L;

        if ((b - a) < a) a = b - a;

        long nowA = b;
        for (long i = 1; i <= a; i++) {
            if (n == 0) n = nowA;
            else n *= nowA;

            if (n != 0 && m != 0 && n % i == 0) {

                n /= i;
                nowA--;
                continue;
            }

            if (m == 0) m = i;
            else m *= i;

            nowA--;
        }
        return n / m;
    }
}
