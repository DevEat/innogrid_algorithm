//1712번 - 손익분기점
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int res = 0;
        if (c-b <= 0) {
            res = -1;
        } else {
            res = (int)Math.floor(a / (c-b)) + 1;
        }
        System.out.println(res);
    }
}