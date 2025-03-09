package 영단어암기는괴로워_20920;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] split = s.split(" ");

        int minLength = Integer.parseInt(split[1]);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < Integer.parseInt(split[0]); i++) {
            String input = br.readLine();
            if (input.length() < minLength) continue; // M 보다 짧을때 건너뛰기

            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
            } else map.put(input, 1);
        }

        List<Arr> list = new ArrayList<>();
        for (String string : map.keySet()) {
            list.add(new Arr(string, map.get(string)));
        }

        Collections.sort(list);

        for (Arr arr : list) {
            bw.write(arr.name + "\n");
        }
        bw.close();
    }

    private static class Arr implements Comparable<Arr> {

        private final String name;
        private final int cnt;

        public Arr(String name, int cnt) {
            this.name = name;
            this.cnt = cnt;
        }

        @Override
        public String toString() {
            return "Arr{" +
                    "name='" + name + '\'' +
                    ", cnt=" + cnt +
                    '}';
        }

        @Override
        public int compareTo(Arr o) {
            if (this.cnt < o.cnt) return 1;
            else if (this.cnt > o.cnt) return -1;

            if (this.name.length() < o.name.length()) return 1;
            else if (this.name.length() > o.name.length()) return -1;

            return this.name.compareTo(o.name);
        }
    }
}
