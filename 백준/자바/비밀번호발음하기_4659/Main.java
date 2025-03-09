package 비밀번호발음하기_4659;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            if (check(input)) {
                System.out.println("<" + input + "> is acceptable.");
            } else System.out.println("<" + input + "> is not acceptable.");
        }
    }

    private static boolean check(String input) {
        if (!input.contains("a") && !input.contains("e") && !input.contains("i") // 조건 1
                && !input.contains("o") && !input.contains("u")) return false;

        String[] s = input.split("");

        for (int i = 1; i < s.length; i++) { // 조건 3
            if (s[i - 1].equals(s[i]) && (s[i].equals("e") || s[i].equals("o"))) continue;
            if (s[i-1].equals(s[i])) return false;
        }

        String[] arr = {"a", "e", "i", "o", "u"};
        boolean[] checkBox = new boolean[3];

        for (int i = 1; i < s.length - 1; i++) {//조건 2
            for (String n : arr) {
                if (s[i - 1].equals(n)) checkBox[0] = true;
                if (s[i].equals(n)) checkBox[1] = true;
                if (s[i + 1].equals(n)) checkBox[2] = true;
            }

            if ((checkBox[0] && checkBox[1] && checkBox[2]) || (!checkBox[0] && !checkBox[1]
                    && !checkBox[2])) return false;

            checkBox = new boolean[3];
        }

        return true;
    }
}
