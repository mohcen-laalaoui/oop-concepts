public class Fonctions {
    Byte B;
    Short S;
    Integer I;
    Long L;
    Float F;
    Double D;

    public void fx(int a, Integer n, long c) {
        this.L = n.longValue();
        this.B = (byte) a;
        this.D = a + n.doubleValue() + c;
    }

    public void px(Double d, float f) {
        this.S = d.shortValue();
        this.I = (int) f;
        this.F = d.floatValue();
    }

}
