package abs;

public class Circle extends Shape{
    public double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculArea()
    {
        return Math.PI * radius * radius;
    }
}
