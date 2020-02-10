import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    /**
     * 30 612ms
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine(); // 10^5 자리수 입력은 받아 올 수 없으므로 String으로 받아와서 배열에 초기화
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<numStr.length(); i++) {
            sum += numStr.charAt(i)-'0'; // 해당 인덱스의 char 문자를 숫자로 변경 
            list.add(numStr.charAt(i)-'0');
        }

        Collections.sort(list, Collections.reverseOrder());

        // 30의 배수는 0으로 끝나야 하며, 총합이 3으로 나뉘어져야함
        if(numStr.contains("0") && sum % 3 == 0) {
            for(int i : list)
                System.out.print(i);
            }
        else System.out.println("-1");

    }
}