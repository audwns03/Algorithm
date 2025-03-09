package ZOAC4_23971;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int cnt = 0;
        for (int i = 0; i < h; i = i + (m + 1)) {
            for (int j = 0; j < w; j = j + (n + 1)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
