import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class N과M {
    static int N;
    static int M;
    static StringBuilder sb;
    static Stack<Integer> stack;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        sb = new StringBuilder();
        stack = new Stack<>();

        permu(0, "");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString().trim());
        bw.close();
    }

    public static void permu(int num, String permuStr) {
        if (num == M) {
            sb.append(permuStr.trim() + "\n");
        } else {
            ++num;
            for (int i = 1; i <= N; i++) {
                if (!stack.contains(i)) {
                    stack.push(i);
                    permu(num, permuStr + " " + i);
                    stack.pop();
                }
            }
        }
    }
}