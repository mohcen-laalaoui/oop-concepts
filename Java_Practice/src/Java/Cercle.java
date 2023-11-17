package Java;

public class Cercle {
    protected double r;
    private double x;
    Point a;

    public Cercle(double r, double x) {
        this.r = r;
        this.x = x;
    }

    public Cercle(Point o, double x) {
        this.a = o; // The types must be Point
        this.x = x;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setA(Point p) {
        this.a = p;
    }

    public Point getA() {
        return this.a;
    }

    public double calcSurf() {
        return (Math.pow(r, 2));
    }

    public void disp() {
        System.out.println(" R= " + r + " X= " + x + " Surface= " + calcSurf());
    }

    public void afficher() {
        System.out.println(" X= " + this.a.gettX() + " Y= " + this.getX() + " Surface= " + this.calcSurf());
    }
}
