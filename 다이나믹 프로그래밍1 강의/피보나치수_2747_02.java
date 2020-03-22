import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2747
 */
public class 피보나치수_2747_02 {
    static int memo[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        memo = new int[n + 1];

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fibonacci(n - 2) + fibonacci(n - 1);
        }
        return memo[n];
    }
}