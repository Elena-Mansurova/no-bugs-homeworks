package pracrice_5;

import java.util.Scanner;

public class SumOfNumbersUntillNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            System.out.println(sum);
        }
    }
}
