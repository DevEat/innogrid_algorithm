import java.util.Scanner;

/**
 * Bottom-up 1로 만들기
 */
public class MakeNtoOne {
    static int[] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = new int[n + 1];

        System.out.println(go(n));

        sc.close();
    }

    public static int go(int n) {
        if (n == 1)
            return 0;
        if (d[n] > 0)
            return d[n]; // 메모이제이션
        d[n] = go(n - 1) + 1;
        if (n % 2 == 0) {
            int temp = go(n / 2) + 1;
            if (d[n] > temp)
                d[n] = temp;
        }
        if (n % 3 == 0) {
            int temp = go(n / 3) + 1;
            if (d[n] > temp)
                d[n] = temp;
        }
        return d[n];
    }
}