import java.util.Scanner;

// 2839 - 설탕
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bag = 0;
        int N = scan.nextInt();

        if (0 == N%5) {
            bag += N/5;
        } else {
            for(int i= N/5; 0 <= i; i--) {
                if (0 == (N - i*5) % 3) {
                    N -= (i*5);
                    bag = i + (N/3);
                    break;
                }
            }
        }

        if (0 == bag) {
            bag = -1;
        }

        System.out.println(bag);
    }
}
