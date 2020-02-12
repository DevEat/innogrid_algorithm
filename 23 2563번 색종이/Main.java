import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 * 색종이 - 구현
 * 
 * 정사각형(가로 세로 100) 모양의 흰색 도화지에 정사각형(10)인 검은 도화지를 붙이고 그 영역을 구하는 문제 (※ 색종이 밖에는
 * 못붙임)
 * 
 * input 1. 색종이의 수 N 2. 색종이를 붙인 시작 좌표(x, y) * N개
 * 
 * output 총 넓이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10000];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[100 * (y - 1 + j) + x + k] = arr[100 * (y - 1 + j) + x + k] | 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1)
                sum++;

        System.out.print(sum);
    }
}