package ShapesLab;

public class Circle extends Shape{
    private double radius;
    public Circle(String name, String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    public double findArea(){
        return (double)Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return super.getColor() + " " + super.getName() + " with a radius of " + radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
