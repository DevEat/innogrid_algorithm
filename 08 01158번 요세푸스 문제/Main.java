import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제 120ms
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());
        int secound = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> newlist = new ArrayList<Integer>();

        for (int i = 1; i <= first; i++) {
            list.add(i);
        }
        int index = 0;

        while(!list.isEmpty()) {
            index += secound - 1;
            if (index >= list.size()){
                index %= list.size();
            }
            newlist.add(list.remove(index));
        }
        String str = newlist.toString().replaceAll("[^0-9, ]","");
        System.out.println("<"+str+">");
        // String listString = newlist.stream().map(n -> String.valueOf(n)).collect(Collectors.joining());
        // System.out.println(listString);
    }
}