package TP01;

public class TP01 {
    public static void main(String[] args) {
        long a = 145l;
        float b = 12.f;
        double c;
        c = a * b;
        System.out.println("The first Java program !");
        System.out.println("C= " + c);
    }

    public class Cercle {
        double x;
        double y;
        double r;

        public void initialisation(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public double calculSurf() {
            return (Math.PI * Math.pow(this.r, 2)); // We used a Math class
        }

        public double calculPer() {
            return (Math.PI * this.r);
        }

        public void disp() {
            System.out.println(
                    "X= " + this.x + "Y= " + this.y + "Rayon= " + this.r + " La surface= " + this.calculSurf());
        }
    }
}