package 삼각형과세_5073;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            boolean invalid = isTriangle(arr);
            if (!invalid) System.out.println("Invalid");
            else System.out.println(checkTriangle(arr));
        }

    }

    private static boolean isTriangle(int[] arr) {
        int temp = Math.max(arr[0], arr[1]);
        int max = Math.max(temp, arr[2]);

        int a = 0, b = 0;
        int check = 0;
        for (int i : arr) {
            if(max == i && check == 0){
                check = 1;
                continue;
            }


            if(a==0) a = i;
            else if(b==0) b = i;
        }

        return max < a + b;
    }

    private static String checkTriangle(int[] arr) {
        if (arr[0] == arr[1] && arr[1] == arr[2]) return "Equilateral";
        else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) return "Scalene";
        else return "Isosceles";
    }

}
