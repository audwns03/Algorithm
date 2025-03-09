package 칸토어집합_4779;

import java.io.*;
import java.util.Arrays;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char[] arr;


    public static void main(String[] args) throws IOException {

        String str;

        while ((str = br.readLine()) != null) {
            int input = Integer.parseInt(str);
            int cnt = 1;
            for (int i = 0; i < input; i++) {
                cnt *= 3;
            }
            arr = new char[cnt];
            Arrays.fill(arr, '-');
            run(0, cnt);

            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
            }
            System.out.println(sb);
        }
        br.close();
    }

    private static void run(int start, int size) {

        if (size <= 1) return;

        int newSize = size / 3;

        for (int i = start + newSize; i < start + newSize * 2; i++) {
            arr[i] = ' ';
        }

        run(start, newSize);
        run(start + newSize * 2, newSize);
    }
}
