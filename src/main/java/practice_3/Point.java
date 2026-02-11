package practice_3;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    void setX(double newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("x: " + x + ", y; " + y);
    }
}
