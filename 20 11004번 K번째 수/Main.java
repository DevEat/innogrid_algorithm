import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * K번째 수 시간 초과 
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        System.out.print(binarySearch(arr, K - 1));
    }

    static int binarySearch(int[] arr, int K) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (mid != K) {
            if (K < mid) {
                high = mid;
            } else if (K > mid) {
                low = mid;
                K = K - mid + 1;
            }
            mid = (low + high) / 2;
        }
        return arr[mid];
    }
}