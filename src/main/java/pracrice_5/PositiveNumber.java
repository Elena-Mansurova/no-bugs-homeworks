package pracrice_5;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a positive number");
            num = scanner.nextInt();

        } while (num <= 0);
    }
}
