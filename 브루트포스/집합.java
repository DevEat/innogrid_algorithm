import java.util.Scanner;

public class 집합 {
    static int ans = 0;

    public static void backtrack(int[] a, int sum, int index, int s) {
        if (index >= a.length) {
            if (sum == s) {
                ans++;
            }
            return;
        }

        backtrack(a, sum + a[index], index + 1, s);
        backtrack(a, sum, index + 1, s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        backtrack(a, 0, 0, s);
        if (s == 0)
            ans--;
        System.out.println(ans);
    }
}