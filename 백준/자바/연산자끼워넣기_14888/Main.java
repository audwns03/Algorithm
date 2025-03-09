package 연산자끼워넣기_14888;

import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] arr;
    static int[] mask = new int[4];
    static int[] operator = new int[4];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        arr = new int[n];

        String s1 = br.readLine();
        String[] split = s1.split(" ");
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        String s2 = br.readLine();
        String[] split1 = s2.split(" ");
        for (int i = 0; i < split1.length; i++) {
            operator[i] = Integer.parseInt(split1[i]);
        }

        run(0);

        System.out.println(max);
        System.out.println(min);
    }

    static void run(int level) {
        if (level == n - 1) {
            int total = arr[0];

            for (int i = 1; i < n; i++) {
                if (list.isEmpty()) continue;

                if (list.get(i - 1) == 0) {
                    total += arr[i];
                } else if (list.get(i - 1) == 1) {
                    total -= arr[i];
                } else if (list.get(i - 1) == 2) {
                    total *= arr[i];
                } else if (list.get(i - 1) == 3) {
                    total /= arr[i];
                }
            }

            if (total > max) max = total;
            if (total < min) min = total;

            return;
        }


        for (int i = 0; i < 4; i++) {
            if (operator[i] == 0 || operator[i] == mask[i]) continue;

            mask[i]++;
            list.add(i);
            run(level + 1);
            mask[i]--;
            list.remove(list.size() - 1);
        }
    }
}
