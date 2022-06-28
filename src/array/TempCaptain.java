package array;

import java.util.Scanner;

// 오답
public class TempCaptain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int count = 0;
        int max = 0;
        int nowClass = 0;

        int maxCount = 0;
        int answer = 0;


        for (int i = 0; i < n; i++) {
            count = 0;
            max = 0;
            nowClass = arr[i][0];
            for (int j = 0; j < n; j++) {
                if(nowClass == arr[j][i]) {
                    count++;
                }
            }

            if(count > max) {
                max = count;
            }

            arr[i][n] = max;
        }

        for (int i = n; i < 0; i--) {
            if(arr[i][n] > maxCount) {
                maxCount = arr[i][n];
                answer = i;
            }
        }

        return answer;
    }
}
