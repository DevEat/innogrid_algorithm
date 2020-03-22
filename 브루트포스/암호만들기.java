import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

// 백트래킹
// 모든 경우의 수에 대해 탐색을 진행 할 때
// 탐색을 한 후 다시 값을 탐색하기 이전으로 되돌리는 형태 알고리즘
// 
// 문제에서 제시한 3가지 조건을 만족 시키는 경우
// (최소 한개의 모음을 사용, 최소 두개의 자음을 사용, 알파벳이 증가하는 순서로 나열)
// 생성된 암호를 출력 해주고 다시 다른 경우의 수를 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 암호만들기 {
    static boolean[] visit;
    static String[] code;
    static int l, c; // 2와 4이라고 쳐

    private static void backtracking(int start, int depth) {
        if (depth == l) {
            int vowel = 0, consonant = 0;
            String ans = "";
            for (int i = 0; i < c; i++) { // if c = 4라면 4개 출력 해야함
                if (visit[i]) {
                    ans += code[i];
                    if (code[i].equals("a") || code[i].equals("e") || code[i].equals("i") || code[i].equals("o")
                            || code[i].equals("u"))
                        vowel++;
                    else
                        consonant++;
                }
            }
            if (vowel >= 1 && consonant >= 2)
                System.out.println(ans);
            return;
        }

        for (int i = start; i < c; i++) {
            visit[i] = true;
            backtracking(i + 1, depth + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("\\s"); // "\\s".equals(" ")
        code = br.readLine().split("\\s");

        l = Integer.parseInt(line[0]);
        c = Integer.parseInt(line[1]);
        visit = new boolean[c];
        Arrays.sort(code);

        backtracking(0, 0);
    }
}