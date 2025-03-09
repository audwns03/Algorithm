package 집합_11723;

import java.util.*;

public class Main {
    private static Set<Integer> set = new HashSet<>();
    private static Set<Integer> setAll = new HashSet<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= 20; i++) {
            setAll.add(i);
        }

        for (int i = 0; i < input; i++) {
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            run(split);
        }

        System.out.println(sb);
    }

    private static void run(String[] input) {
        int n = 0;
        if (!input[0].equals("all") && !input[0].equals("empty")) n = Integer.parseInt(input[1]);

        switch (input[0]) {
            case "add" -> {
                set.add(n);
            }
            case "remove" -> {
                set.remove(n);
            }
            case "check" -> {
                if (set.contains(n)) sb.append(1);
                else sb.append(0);

                sb.append("\n");
            }
            case "toggle" -> {
                if (!set.remove(n)) set.add(n);
            }
            case "all" -> {
                set.clear();
                set.addAll(setAll);
            }
            case "empty" -> {
                set.clear();
            }
        }
    }
}
