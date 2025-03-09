package N과M1_15649;

import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static boolean[] mask = new boolean[9];
    private static int[] arr = new int[8];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        run(0, 0);
    }


    private static void run(int level, int now) {
        if (level == m) {
            for (int i = 0; i < level; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (mask[i]) continue;
            mask[i] = true;
            arr[now] = i;
            run(level + 1, now + 1);
            mask[i] = false;
            arr[now] = 0;
        }
    }
}
