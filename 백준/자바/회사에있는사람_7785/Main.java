package 회사에있는사람_7785;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> log = getInputLog();

        for (String s : log) {
            System.out.println(s);
        }
    }

    static class Compare implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

    private static Set<String> getInputLog() {
        Set<String> log = new TreeSet<>(new Compare());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");

            if (split[1].equals("enter")) {
                log.add(split[0]);
            } else log.remove(split[0]);
        }

        return log;
    }
}