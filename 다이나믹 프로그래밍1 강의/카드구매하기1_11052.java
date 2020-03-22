import java.util.Scanner;

/**
 * baek11052 카드 구매하기1 184ms
 * 
 * 입력 첫째줄에 구매하려고 하는 카드의 개수 N이 주어진다. (1 ≤ N ≤ 1,000) 둘째 줄에는 Pi가 P1부터 PN까지 순서대로
 * 주어진다. (1 ≤ Pi ≤ 10,000)
 *
 * 출력 카드 N개를 갖기 위해 지불해야 하는 금액의 최댓값을 출력
 */
public class 카드구매하기1_11052 {
    public static int compare(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pack[] = new int[n + 1];
        int dp[] = new int[1001];

        pack[0] = 0;
        dp[0] = 0;
        for (int i = 1; i <= n; i++)
            pack[i] = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = compare(dp[i], dp[i - j] + pack[j]);
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }
}