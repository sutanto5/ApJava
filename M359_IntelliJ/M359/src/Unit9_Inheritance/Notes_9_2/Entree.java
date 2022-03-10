package Unit9_Inheritance.Notes_9_2;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super(name);
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }

    @Override
    public String toString(){
        String entree = "Entree: " + super.getName();
        entree += "\n\tNumber of Sides: " + numSides;
        return entree;
    }
}
