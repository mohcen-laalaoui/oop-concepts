package Java;

public class Main {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(2, 1);
        Cercle c3 = new Cercle(4, 7);
        Point p1 = new Point(12, 2.5);
        Cercle c2 = new Cercle(p1, 4);
        c2.calcSurf();
        c2.afficher();
    }
}
