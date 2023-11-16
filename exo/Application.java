public class Application {

    public static void main(String[] args) {
        byte b = 3;
        short s = 6;
        int i = 10;
        long l = 15;
        float f = 20;
        double d;
        Byte bb = 3;
        Short ss = 5;
        Integer ii = 12;
        Long ll = 9l;
        Float ff = 10.f;
        Double dd = 12.3;
        Fonctions obj1 = new Fonctions();
        obj1.fx(dd.intValue(),(int) s, l);
        obj1.fx(ll.intValue(), (int) bb, ii + b);
        obj1.px((double) f, dd.floatValue());
        obj1.px((double) bb, ff);
        if (obj1.B.equals(b)) {
            System.out.println("B= " + b);
        } else {
            System.out.println("n'est pas equals");
        }
        System.out.println("B= " + obj1.B);
        System.out.println("D= " + obj1.D);
        System.out.println("L= " + obj1.L);
        System.out.println("S= " + obj1.S);
        System.out.println("I= " + obj1.I);
        System.out.println("F= " + obj1.F);
    }
}
