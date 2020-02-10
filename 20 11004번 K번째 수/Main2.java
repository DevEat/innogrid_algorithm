import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * K번째 수 시간 초과 
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        quickSort(arr, 0, arr.length - 1);
        System.out.print(arr[K - 1]);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int t = partition(arr, start, end);
            quickSort(arr, start, t - 1);
            quickSort(arr, t + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int idx = start - 1;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot)
                swap(arr, ++idx, i);
        }

        swap(arr, ++idx, end);
        return idx;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}