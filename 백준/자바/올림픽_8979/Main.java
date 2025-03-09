package 올림픽_8979;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[1001];
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int rank = scanner.nextInt();
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = scanner.nextInt();
            }
            countries[i] = new Country(rank, arr);
        }

        Arrays.sort(countries, 0, n);
        getRank(countries, n);

        for (int i = 0; i < n; i++) {
            if (countries[i].num == k) {
                System.out.println(countries[i].rank);
                break;
            }
        }
    }

    private static void getRank(Country[] countries, int n) {
        int rankNum = 1;
        int check = 0;
        countries[0].rank = rankNum;
        for (int i = 1; i < n; i++) {
            if (countries[i].compareTo(countries[i - 1]) == 0) {
                countries[i].rank = rankNum;
                check++;
            } else {
                rankNum = rankNum + 1 + check;
                countries[i].rank = rankNum;
                check = 0;
            }
        }
    }


    static class Country implements Comparable<Country> {
        private final int num;
        private int[] medal;
        private int rank;

        public Country(int rank, int[] medal) {
            this.num = rank;
            this.medal = medal;
        }

        @Override
        public int compareTo(Country o) {
            if (o.medal[0] > this.medal[0]) return 1;
            else if (o.medal[0] == this.medal[0] && o.medal[1] > this.medal[1]) return 1;
            else if(o.medal[0] == this.medal[0] && o.medal[1] == this.medal[1] &&
                    o.medal[2] > this.medal[2]) return 1;
            else if (o.medal[0] == this.medal[0] && o.medal[1] == this.medal[1] &&
                    o.medal[2] == this.medal[2]) return 0;
            else return -1;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "num=" + num +
                    ", medal=" + Arrays.toString(medal) +
                    ", rank=" + rank +
                    '}';
        }
    }
}
