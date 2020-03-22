import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 일이삼더하기_9095_02 {

    BufferedReader br;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] dp = new int[12];// 경우의 수 배열

    void Solve() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        dp[0] = 0;
        dp[1] = 1;// 숫자 1 경우의 수
        dp[2] = 2;// 숫자 2 경우의 수
        dp[3] = 4;// 숫자 3 경우의 수
        for (int i = 4; i <= dp.length - 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine().trim());
            sb.append(dp[num] + "\n");
        }
        br.close();
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new 일이삼더하기_9095_02().Solve();
    }
}