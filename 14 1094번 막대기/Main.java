import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 막대기 76ms
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = 64;
        int x = Integer.parseInt(br.readLine());
        int count = 0;

        while (x > 0) {
            if (length > x) {
                length /= 2;
            } else {
                count++;
                x -= length;
            }
        }
        System.out.println(count);
    }
}