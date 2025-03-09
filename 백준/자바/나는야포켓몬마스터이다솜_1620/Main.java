package 나는야포켓몬마스터이다솜_1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> integerMap = new HashMap<>();
        Map<String, Integer> stringMap = new HashMap<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            integerMap.put(i, input);
            stringMap.put(input, i);
        }

        for (int i = 0; i < m; i++) {
            String input = scanner.next();
            int parsedInt;

            try {
                parsedInt = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println(stringMap.get(input));
                continue;
            }
            System.out.println(integerMap.get(parsedInt));
        }
    }
}
