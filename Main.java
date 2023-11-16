package abs;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3 , 10);
        Shape s2 = new Circle(4);
        s1.display();
        System.out.println("Area of rectangle: "+ s1.calculArea());
        s2.display();
        System.out.println("Area of circle: "+ s2.calculArea());
    }
}