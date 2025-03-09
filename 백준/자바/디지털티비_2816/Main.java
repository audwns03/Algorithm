package 디지털티비_2816;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }

        getFirst(0);
        System.out.print(1);
        getSecond(1);
    }

    private static void getFirst(int level) {
        if (list.get(level).equals("KBS1")) {
            list.remove(level);
            List<String> tempList = new ArrayList<>();
            tempList.add("KBS1");
            tempList.addAll(list);
            list = tempList;
            return;
        }

        System.out.print(1);
        getFirst(level + 1);
        System.out.print(4);
    }

    private static void getSecond(int level) {
        if (list.get(level).equals("KBS2")) {
            return;
        }

        System.out.print(1);
        getSecond(level + 1);
        System.out.print(4);
    }
}
