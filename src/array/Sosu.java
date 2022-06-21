package array;

import java.util.Scanner;

public class Sosu {

    public static int solution(int n) {
        int count = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                count++;
                for(int j = i; j<= n; j= j+i) { // 소수의 배수는 소수가 아니므로 1로 체크하여 제외
                    ch[j] = 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
