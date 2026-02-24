package pracrice_5;
import java.util.Scanner;


public class CheckingPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String validPassword = "ABSD";
        String password;

        do {
            System.out.println("Enter valid password");
            password = scanner.nextLine();
        } while (!password.equals(validPassword));
    }
}
