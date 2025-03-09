package N과M3_15651;

import java.io.*;

public class Main {

    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[7];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        run(0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sb));
        bw.close();
    }

    private static void run(int level) {

        if (level == m) {
            for (int i = 0; i < level; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }


        for (int i = 1; i <= n; i++) {
            arr[level] = i;
            run(level + 1);
        }
    }
}
