import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2747
 */
public class 피보나치수_2747_03 {
    static int d[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        d = new int[n + 1];
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);

    }
}