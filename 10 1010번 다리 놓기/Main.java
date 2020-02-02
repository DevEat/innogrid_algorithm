import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

/**
 * 다리 놓기 124ms
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            System.out.println(combination(r, n));
        }
    }

    public static BigInteger combination(int r, int n) {
        BigInteger sum = new BigInteger("1");
        int temp = r;
        while (r > 0) {
            sum = sum.multiply(BigInteger.valueOf(n));
            --r;
            --n;
        }
        while (temp > 0) {
            sum = sum.divide(BigInteger.valueOf(temp));
            --temp;
        }
        return sum;
    }
}