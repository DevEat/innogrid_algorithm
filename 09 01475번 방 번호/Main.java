import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 방 번호 문제 84ms
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String n2 = n;

        String[] arr = { "0", "1", "2", "3", "4", "5", "7", "8", "69" };
        List<Integer> cnt = new ArrayList<>();

        int i = 0;
        for (String s : arr) {
            int b = n2.replaceAll("[^" + s + "]", "").length();
            if (i == 8) {
                b = b % 2 == 0 ? b / 2 : b / 2 + 1;
            }
            cnt.add(b);
            i++;
        }
        System.out.println(Collections.max(cnt));
    }
}