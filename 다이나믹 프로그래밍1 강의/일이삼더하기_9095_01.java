import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기_9095_01 {
    static int D[] = new int[11];

    // D[n] = D[n-1] + D[n-2] + D[n-3];
    void Solve() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());

            sb.append(dp(n) + "\n");
        }
        System.out.println(sb.toString());
    }

    static int dp(int n) {

        D[0] = 1;
        D[1] = 1;
        D[2] = 2;

        if (n < 3) {
            return D[n];
        } else {
            return dp(n - 1) + dp(n - 2) + dp(n - 3);
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new 일이삼더하기_9095_01().Solve();
    }
}
