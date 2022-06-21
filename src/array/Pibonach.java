package array;

import java.util.Scanner;

public class Pibonach {

    public static int[] solution(int n) {
        int[] pibo = new int[n];
        pibo[0] = 1;
        pibo[1] = 1;

        for (int i = 2; i < n; i++) {
            pibo[i] = pibo[i-2] + pibo[i-1];
        }

        return pibo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x: solution(n)) {
            System.out.print(x + " ");
        }
    }
}
