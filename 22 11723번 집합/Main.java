import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 집합 912ms
 * 
 * ~ : 비트를 반전 & : 두 비트 모두 1일 때 1 | : 두 비트 중 하나만 1이라도 1 ^ : 두 비트가 다를
 * 때 1 << : 비트를 왼쪽으로 이동 >> : 비트를 오른쪽으로 사라지게함 >>> : 비트를 오른쪽으로 이동(빈공간을 0으로 채움)
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        for (int i = 0; i < M; i++) { // M개의 연산
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 수행할 명령어를 받아옴
            if (command.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                S = S | (1 << x);
            } else if (command.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                S = S & ~(1 << x);
            } else if (command.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if ((S & (1 << x)) > 0)
                    answer.append("1\n");
                else
                    answer.append("0\n");
            } else if (command.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                S = S ^ (1 << x);
            } else if (command.equals("all")) {
                S = (1 << 21) - 1;
            } else
                S = 0;
        }
        System.out.println(answer);
    }
}