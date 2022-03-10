package ShapesLab;

public class Square extends Rectangle{
    private double sideLength;

    public Square(String name, String color, double sideLength){
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public void scaleSize(double scale){
        sideLength*=(scale);
    }

    @Override
    public String toString() {
        return super.getColor() + " " + super.getName() + " with side length of " + sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
