package Inh1;

public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " +  myCar.modelName);
    }
}
