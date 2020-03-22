import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2747
 * 
 * 시간 초과
 */
public class 피보나치수_2747_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}