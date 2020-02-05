import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 나이순 정렬 
 */

public class Main2 {
    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int T = Integer.parseInt(br.readLine());
            StringBuilder[] answer = new StringBuilder[201];

            // Arrays.fill(answer, new StringBuilder("")); 이거 하면 출력 초과. 왜 이유를 모르겠다.

            for (int i = 0; i < 201; i++) {
                answer[i] = new StringBuilder("");
            }

            System.out.println(answer.length);

            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int age = Integer.parseInt(st.nextToken());
                answer[age].append(age).append(" ").append(st.nextToken()).append("\n");
            }
            for (StringBuilder sb : answer) {
                bw.write(sb.toString());
            }
        }
    }
}
