package pracrice_5;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n ) {
            i++;
            result = result * n;
        }  System.out.println(result);

    }
}
