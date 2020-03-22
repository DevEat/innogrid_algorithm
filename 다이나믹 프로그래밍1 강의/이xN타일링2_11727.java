import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11727
 */
public class 이xN타일링2_11727 {
    static int[] memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        memo = new int[n + 1];

        System.out.println(dp(n));
    }

    public static int dp(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n] == 0) {
            memo[n] = 2 * dp(n - 2) + dp(n - 1);
        }

        return memo[n] % 10007;
    }
}