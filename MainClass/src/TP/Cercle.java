package TP;

public class Cercle {
    private double r;
    private double c;
    Point a;

    public Cercle(double x, double y) {
        this.r = x;
        this.c = y;
    }

    public Cercle(Point o, double y) {
        this.a = o; // The same type (point = point)
        this.c = y;
    }

    public void setR(double x) {
        this.r = x;
    }

    public double getR() {
        return this.r;
    }

    public void setC(double y) {
        this.c = y;
    }

    public double getC() {
        return this.c;
    }

    public void setA(Point o) {
        this.a = o;
    }

    public Point getA() {
        return this.a;
    }

    public void decalage(double dx, double dy) {
        this.r += dx;
        this.c += dy;
    }

    public void decal(double ax, double ay) {
        this.a.setX(this.a.getX() + ax);
        this.a.setY(this.a.getY() + ay);
    }

    public double calcSurf() {
        return (Math.PI * Math.pow(this.r, 2));
    }

    public void disp() {
        System.out.println("R= " + r + " C= " + c + " La surface est: " + calcSurf());
    }
}