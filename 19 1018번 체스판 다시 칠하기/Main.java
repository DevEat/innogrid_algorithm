import java.io.*;
import java.util.*;

public class Main {
    static String[] board = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
            "BWBWBWBW" };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

         // 입력값 저장
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        int answer = Integer.MAX_VALUE; 
        for (int i = 0; i <= N - 8; i++) { // 아래로 한 칸씩 이동
            for (int j = 0; j <= M - 8; j++) { // 우측으로 한 칸씩 이동
                int count = 0;
                for (int k = 0; k < 8; k++) { // k와 l은 [8][8]의 인덱스를 나타냄
                    String temp = input[i + k].substring(j, j + 8); // i + 0, 1, 2, ... ,7 | 8개의 문자
                    for (int l = 0; l < 8; l++) {
                        if (temp.charAt(l) == board[k].charAt(l)) {
                            count++;
                        }
                    }
                }
                if (count >= 32) // 만약 count가 32보다 크다면, B로 시작하는 체스판이 더 적은 count
                    count = 64 - count;
                answer = Math.min(answer, count); // 가장 작은 값으로 갱신
            }
        }
        bw.write(answer + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}