package 알고리즘수업_피보나치수1_24416;

import java.io.*;

public class Main {

    static int cntFunction;
    static int cntFib;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int input = Integer.parseInt(s);

        run(input);
        fib(input);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(cntFunction + " " + cntFib);
        bw.close();
    }

    static int run(int level) {
        if (level == 1 || level == 2) {
            cntFunction++;
            return 1;
        } else return (run(level - 1) + run(level - 2));
    }

    static int fib(int n) {
        int[] arr = new int[43];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            cntFib++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
