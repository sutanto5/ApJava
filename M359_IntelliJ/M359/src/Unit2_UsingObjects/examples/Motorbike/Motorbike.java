package Unit2_UsingObjects.examples.Motorbike;

public class Motorbike {
    // horsepower, color
    private int horsepower;
    private String color;


    //getters
    public int getHorsepower(){
        return horsepower;
    }
    public String getColor(){
        return color;
    }

    //setters
    public void setHorsepower(int horsepowerNum){
        horsepower = horsepowerNum;
    }

    public void setColor(String aColor){
        color = aColor;
    }

    //Constructors
    public Motorbike(int hp,String aColor){
        horsepower = hp;
        color = aColor;
    }

    public Motorbike(int hp){
        horsepower = hp;
    }

    //Instances/objects
    Motorbike bike1 = new Motorbike(120, "red");
    Motorbike bike2 = new Motorbike(150);

    // create a method whose job is to make the motorbike ore powerful by adding ten to its horsepower
    public void addHorsepower(){
        horsepower += 10;
    }

    public void printInfo(){
        System.out.println("");
    }

}
