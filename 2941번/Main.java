import java.util.Scanner;

/**
 * CroatiaAlphabet
 */
public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
  
        String input = scanner.nextLine();

        String[] crbat = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; 

        for(int i = 0 ; i < crbat.length ; i++){
            input = input.replace(crbat[i], "*");
        }

        System.out.print(input.length());
    }
}