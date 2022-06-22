package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseSosu {

    private static boolean isPrime(int res) {
        if(res == 1) {
            return false;
        }

        for (int i = 2; i < res; i++) {
            if(res%i == 0) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;

            while (temp > 0) {
                int t = temp%10;
                res = res*10 + t;
                temp = temp/10;
            }

            if(isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)){
            System.out.print(x + " ");
        }
    }

}
