
/**
 * 영화감독 숌
 * 
 * 666이라는 숫자가 들어간 
 */
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int num = 666;

        while (N != cnt) {
            num++;
            if (String.valueOf(num).contains("666"))
                cnt++;
        }
        System.out.println(num);
    }
}