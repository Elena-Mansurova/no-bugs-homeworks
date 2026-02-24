package pracrice_5;

import java.util.Scanner;

public class FinalCountdown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;

        }
    }
}
