package pracrice_5;

import java.util.Scanner;

public class OnlyPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int num = scanner.nextInt();
            if(num < 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
