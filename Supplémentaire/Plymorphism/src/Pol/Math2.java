package Pol;

public class Math2 extends Math{

    public Math2(int a , int b ){
        super(a , b );
    }

    public int calc(){ //methode redéfini
        int s;
        s = this.getA() * this.getB() ;
        return s;
    }

    public void disp(){
        super.disp();
        System.out.println(" La surface est: " +this.calc()+ " m2");
    }
}
