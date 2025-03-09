package 쿠키의신체측정_20125;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<>();
        int[] arr = new int[5];
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            list.add(s.split(""));
        }


        int y = 0, x = 0;
        run:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list.get(i)[j].equals("*")) {
                    y = i + 1;
                    x = j;
                    System.out.println((y + 1) + " " + (x + 1));
                    break run;
                }
            }
        }

        getLeftArm(x, list, y, arr);
        getRightArm(x, n, list, y, arr);
        getWaist(y, n, list, x, arr);
        getLeftLeg(y, n, list, x, arr);
        getRightLeg(y, n, list, x, arr);


        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

    }

    private static void getRightLeg(int y, int n, ArrayList<String[]> list, int x, int[] arr) {
        for (int i = y + 1; i < n; i++) {
            if (list.get(i)[x + 1].equals("*")) {
                arr[4]++;
            }
        }
    }

    private static void getLeftLeg(int y, int n, ArrayList<String[]> list, int x, int[] arr) {
        for (int i = y + 1; i < n; i++) {

            if (list.get(i)[x - 1].equals("*")) {
                arr[3]++;
            }
        }
    }

    private static void getWaist(int y, int n, ArrayList<String[]> list, int x, int[] arr) {
        for (int i = y + 1; i < n; i++) {
            if (list.get(i)[x].equals("*")) {
                arr[2]++;
            }
        }
    }

    private static void getRightArm(int x, int n, ArrayList<String[]> list, int y, int[] arr) {
        for (int i = x + 1; i < n; i++) {
            if (list.get(y)[i].equals("*")) {
                arr[1]++;
            }
        }
    }

    private static void getLeftArm(int x, ArrayList<String[]> list, int y, int[] arr) {
        for (int i = x -1; i >= 0; i--) {
            if (list.get(y)[i].equals("*")) {
                arr[0]++;
            }
        }
    }
}
