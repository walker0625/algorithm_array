package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RSP {

    public static List<Character> solution(int n, int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) {
                answer.add('D');
            } else if(a[i] == 1 && b[i] == 2) {
                answer.add('B');
            } else if(a[i] == 2 && b[i] == 3) {
                answer.add('B');
            } else if(a[i] == 3 && b[i] == 1) {
                answer.add('B');
            } else {
                answer.add('A');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (char c: solution(n, a, b)) {
            System.out.println(c);
        }

    }
}
