package pracrice_5;

import java.util.Scanner;

public class PrintStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            if (str.equals("stop")) {
                break;
            }
            System.out.println(str);
        }
    }
}
