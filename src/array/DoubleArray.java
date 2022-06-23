package array;

import java.util.Scanner;

public class DoubleArray {

    private static int solution(int n, int[][] arr) {
        int max = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

}
