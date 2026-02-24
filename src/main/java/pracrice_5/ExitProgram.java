package pracrice_5;
import java.util.Scanner;

public class ExitProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String rightWord = "exit";
        String word;

        do {
            System.out.println("Enter exit" );
            word = scanner.nextLine();
        } while (!word.equals(rightWord));
    }
}
