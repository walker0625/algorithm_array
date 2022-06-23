package array;

import java.util.Scanner;

// 오답
public class CountPeak {

    private static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(i-1 >= 0 && j-1 >= 0 && j+1 <= n-1 && i+1 <= n-1) {
                    if ((arr[i][j] > arr[i + 1][j]) && (arr[i][j] > arr[i - 1][j])
                            && (arr[i][j] > arr[i][j + 1]) && (arr[i][j] > arr[i][j - 1])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

}
