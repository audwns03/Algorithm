package 풍선터뜨리기_2346;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] split = s1.split(" ");

        List<Numbers> list = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            list.add(new Numbers(Integer.parseInt(split[i]), i + 1));
        }

        int now = 0;
        for (int i = 0; i < n; i++) {
            Numbers removed = list.get(now);

            if (removed.num > 0) {
                int j = 0;
                while (j < removed.num && list.size() > 1) {
                    now++;

                    if (now >= list.size()) {
                        now = 0;
                    }
                    if (!list.get(now).equals(removed)) j++;
                }
            } else {
                int j = 0;
                while (j < (-removed.num) && list.size() > 1) {
                    now--;

                    if (now < 0) {
                        now = list.size() - 1;
                    }
                    if (!list.get(now).equals(removed)) j++;
                }
            }

            if (removed.index - 1 < list.get(now).index) now--;
            stack.add(removed.index);
            list.remove(removed);
        }

        for (Integer i : stack) {
            bw.write(i + " ");
        }
        bw.close();
    }

    private static class Numbers {
        private final int num;
        private final int index;

        public Numbers(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Numbers num1 = (Numbers) object;
            return num == num1.num && index == num1.index;
        }

        @Override
        public String toString() {
            return "Numbers{" +
                    "num=" + num +
                    ", index=" + index +
                    '}';
        }
    }
}
