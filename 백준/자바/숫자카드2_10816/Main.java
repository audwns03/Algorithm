package 숫자카드2_10816;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            Map<Integer, Integer> cards = getInputCards();
            printResult(cards);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printResult(Map<Integer, Integer> cards) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] split = s.split(" ");

        for (String string : split) {
            sb.append(cards.getOrDefault(Integer.parseInt(string), 0)).append(" ");
        }
        bw.write(sb.toString());
        bw.close();
    }

    private static Map<Integer,Integer> getInputCards() throws IOException {
        Map<Integer, Integer> cards = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] split = s.split(" ");

        for (String string : split) {
            int value = Integer.parseInt(string);
            cards.put(value, cards.getOrDefault(value, 0) + 1);
        }

        return cards;
    }
}
