package 알파벳개수_10808;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] arr = new int[200];

        for(int i=0;i<input.length();i++) {
            arr[input.charAt(i)]++;
        }

        for(int i='a';i<='z';i++) {
            System.out.print(arr[i] + " ");
        }
    }
}