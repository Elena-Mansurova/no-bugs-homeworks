package practice_4;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    static void calculateCircleArea(double r) {
        System.out.println (r * r * PI);
    }
    static void calculateCircumference(double r) {
        System.out.println(2 * PI * r);
    }
}
