package array;

import java.util.Scanner;

public class CanSeeNumber {

    public static int solution(int n, int[] h) {
        int count = 1;
        int tallest = h[0];

        for (int i = 1; i < n; i++) {
            if(h[i] > tallest) {
                tallest = h[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(solution(n, h));
    }

}
