package pracrice_5;

import java.util.Scanner;

public class ResultsOfTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 75 && score <= 89) {
            System.out.println("Хорошо");
        } else if (score >= 60 && score <= 74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
