package N과M4_15652;

import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        arr = new int[m + 1];

        run(0, 1);
        System.out.print(sb);

    }

    static void run(int level,int now) {
        if (level == m) {
            for (int i = 0; i < level; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = now; i <= n; i++) {
            arr[level] = i;
            run(level + 1, i);
        }
    }
}
