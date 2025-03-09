package 알고리즘수업_병합정렬1_24060;

import java.io.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] arr = new int[500001];
    private static int result = 0;
    private static int k;
    private static boolean flag;
    private static final int[] tempArr = new int[500001];

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] split = s.split(" ");
        k = Integer.parseInt(split[1]);
        String s1 = br.readLine();
        String[] input = s1.split(" ");
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        run(0, Integer.parseInt(split[0]) - 1);

        if (result < k){
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(-1 + "\n");
        }
        bw.close();
    }

    private static void merge(int start, int end, int mid) throws IOException {
        int a = start;
        int b = mid + 1;
        int now = 0;
        while (a <= mid && b <= end) {
            if (arr[a] < arr[b]) tempArr[now] = arr[a++];
            else tempArr[now] = arr[b++];

            if (checkIfAnswer(now)) return;

            now++;
        }

        while (a <= mid) {
            tempArr[now] = arr[a++];
            if (checkIfAnswer(now)) return;
            now++;
        }

        while (b <= end) {
            tempArr[now] = arr[b++];
            if (checkIfAnswer(now)) return;
            now++;
        }

        System.arraycopy(tempArr, 0, arr, start, end + 1 - start);
    }

    private static boolean checkIfAnswer(int now) throws IOException {
        result++;
        if (result == k){
            bw.write(tempArr[now] + "\n");
            flag = true;
            return true;
        }
        return false;
    }

    private static void run(int start, int end) throws IOException {

        int mid = (start + end) / 2;
        if (start >= end) return;

        run(start, mid);
        if (flag) return;
        run(mid + 1, end);
        if (flag) return;

        merge(start, end, mid);
    }
}
