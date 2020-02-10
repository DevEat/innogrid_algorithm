import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * K번째 수 시간 초과 
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr.add(Integer.parseInt(st.nextToken()));
        quickSort(arr, 0, arr.size() - 1);
        System.out.print(arr.get(K - 1));
    }

    public static void quickSort(ArrayList<Integer> arr, int start, int end) {
        if (start < end) {
            int t = partition(arr, start, end);
            quickSort(arr, start, t - 1);
            quickSort(arr, t + 1, end);
        }
    }

    public static int partition(ArrayList<Integer> array, int left, int right) {
        int pivot = array.get(right);
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (array.get(j) < pivot) {
                i++;
                Collections.swap(array, i, j);
            }
        }
        Collections.swap(array, i + 1, right);
        return i + 1;
    }
}