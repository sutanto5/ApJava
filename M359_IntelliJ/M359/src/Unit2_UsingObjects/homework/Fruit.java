package Unit2_UsingObjects.homework;

public class Fruit {
    //instance variables

    private String name;
    private boolean ripe;
    private int numServings;

    //Constructors
    public Fruit(String aName, boolean isRipe){
        name = aName;
        ripe = isRipe;
        numServings = 1;
    }

    public Fruit(String aName, boolean isRipe, int aNumber){
        name = aName;
        ripe = isRipe;
        numServings = aNumber;
    }

    //methods - function
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Ripe: " + ripe);
        System.out.println("Number of Servings: " + numServings);
        System.out.println("");
    }

    //getter - gets private variables and makes them public
    public int getNumServings(){
        return numServings;
    }

    public String getName(){
        return name;
    }

    //setters
    public void setNumServings(int servings){
        numServings = servings;
    }

}




