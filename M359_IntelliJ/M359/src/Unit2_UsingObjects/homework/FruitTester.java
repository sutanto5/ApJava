package Unit2_UsingObjects.homework;

public class FruitTester {

    public static void main(String[] args){

        System.out.println("boi");
        System.out.println("");

        int x = 5;
        Fruit myFruit = new Fruit("mango", true, 2);
        myFruit.printInfo();

        int numServingsFruit1 = myFruit.getNumServings();
        System.out.println("My fruit can serve this amount of people: " + numServingsFruit1);
        System.out.println("");


        Fruit myFruit2 = new Fruit("apple", false);
        myFruit2.printInfo();

        myFruit2.setNumServings(30);
        myFruit2.printInfo();
    }
}
