package ShapesLab;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String name, String color, double width, double length){
        super(name, color);
        this.width = width;
        this.length = length;
    }

    public double findArea(){
        return width* length;
    }

    @Override
    public String toString() {
        return super.getColor() + " " + super.getName() + " with sides of " + width + " by " + length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
