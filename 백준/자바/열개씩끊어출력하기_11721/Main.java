package 열개씩끊어출력하기_11721;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cnt = 0;

        for(int i=0;i<input.length();i++) {
            if(i%10==0 && i!=0) {
                System.out.println();
            }
            char c = input.charAt(i);
            System.out.print(c);
        }
    }
}