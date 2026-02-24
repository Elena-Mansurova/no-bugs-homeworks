package pracrice_5;

import java.util.Scanner;

public class CatchForSimpleNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            if (isPrime) {
                System.out.println("Number is prime");
                break;
            } else {
                System.out.println("not a prime");
            }
        }


    }
}
