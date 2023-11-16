package Java;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void settX(double x) {
        this.x = x;
    }

    public void settY(double y) {
        this.y = y;
    }

    public double gettX() {
        return this.x;
    }

    public double gettY() {
        return this.y;
    }

    public void decal(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }
}
