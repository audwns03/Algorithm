package 수열_2559;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        String s1 = br.readLine();
        String[] split1 = s1.split(" ");
        int[] arr = new int[split1.length];

        for (int i = 0; i < split1.length; i++) {
            arr[i] = Integer.parseInt(split1[i]);
        }

        //미리 더하고 들어가기
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += arr[i];
        }
        int max = cnt;

        for (int i = m; i < n; i++) {
            cnt += arr[i];
            cnt -= arr[i - m];

            if (max < cnt) max = cnt;
        }

        System.out.println(max);

    }
}
