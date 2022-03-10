package ShapesLab;

public class Shape {
    private String name;
    private String color;
    private int numSides;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
        this.numSides = 4;
    }

    @Override
    public String toString(){
        return color + " " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
