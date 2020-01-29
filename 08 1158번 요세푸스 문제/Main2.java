import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제 272ms
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue <Integer> que = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());
        int secound = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= first; i++) {
            que.add(i);
        }

        while (!que.isEmpty()) {
            for (int i = 0; i < secound - 1; i++) {
                que.add(que.remove());
            }
            sb.append(que.remove() + ", ");
        }
        
        System.out.println(sb.toString().substring(0, sb.length() - 2) + ">");
    }
}
