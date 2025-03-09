package 듣보잡_1764;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String n = br.readLine();
        String[] split = n.split(" ");

        Set<String> set = getInputPeople(Integer.parseInt(split[0]));
        Set<String> result = run(set, Integer.parseInt(split[1]));

        bw.write(result.size() + "\n");
        for (String s : result) {
            bw.write(s);
            bw.write("\n");
        }
        bw.close();
    }

    private static Set<String> run(Set<String> set, int n) throws IOException {
        Set<String> result = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                result.add(input);
            }
        }

        return result;
    }

    private static Set<String> getInputPeople(int n) throws IOException {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            set.add(input);
        }

        return set;
    }
}
