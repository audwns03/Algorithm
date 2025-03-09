package 임스와함께하는미니게임_25757;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int result = 0;

        int n = scanner.nextInt();
        String s = scanner.nextLine();

        s = s.trim();
        int playerCount;
        if (s.equals("Y")) playerCount = 1;
        else if (s.equals("F")) playerCount = 2;
        else playerCount = 3;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (set.contains(input)) continue;
            set.add(input);
        }

        int cnt = 0;
        for (int i = 0; i < set.size(); i++) {
            cnt++;
            if (cnt == playerCount) {
                result++;
                cnt = 0;
            }
        }

        System.out.println(result);
    }

}
