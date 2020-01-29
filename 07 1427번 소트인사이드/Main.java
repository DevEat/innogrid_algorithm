import java.util.Scanner;

/**
 소스인사이드 104ms
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] chs = input.toCharArray();

        for (int i = 0; i < chs.length - 1; i++) {
            for(int j = i; j < chs.length ; j++){
                if(Character.getNumericValue(chs[i]) < Character.getNumericValue(chs[j])){
                    char temp = chs[i];
                    chs[i] = chs[j];
                    chs[j] = temp;
                }
            }
        }

        System.out.println(String.valueOf(chs));

        scanner.close();
    }
}