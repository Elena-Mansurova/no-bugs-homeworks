package pracrice_5;

import java.util.Scanner;

public class FindMaxnumber {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        int number2 = scanner2.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
