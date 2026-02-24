package pracrice_5;

import java.util.Scanner;

public class IfElseTasks {

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int number = newScanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

}
