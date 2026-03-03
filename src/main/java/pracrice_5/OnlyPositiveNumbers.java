package pracrice_5;

import java.util.Scanner;

public class OnlyPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int num = scanner.nextInt();
            if(num < 0) {
                System.out.println("Enter a positive number");
                continue;
            }
            System.out.println(num);
        }
    }
}
