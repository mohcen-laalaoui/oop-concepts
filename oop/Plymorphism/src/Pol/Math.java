package Pol;

public class Math {
    private int a;
    private int b;

    public Math(int a , int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return this.a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int getB(){
        return this.b;
    }

    public int calc(){ //methode redéfini
        int c;
        c = a * b;
        return c;
    }

    public void disp(){
        System.out.println(this.getA() + " x " + this.getB() + " = " + this.calc());
    }
}
