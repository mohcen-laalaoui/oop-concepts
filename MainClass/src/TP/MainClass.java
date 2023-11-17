package TP;

public class MainClass {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(4.2, 2.5);
        Cercle c2 = new Cercle(2.1, 10.2);
        c1.getC();
        c1.setC(10);
        c1.disp();
        c2.getR();
        c2.setR(5);
        c2.disp();
        c1.decalage(15, 17);
        c2.decalage(14, 11);
        c1.disp();
        c2.disp();
        Point a1 = new Point(4, 2.1f);
        Cercle c3 = new Cercle(a1, 2.5f);
        c3.decal(12, 7.9);
        c3.disp();

    }
}