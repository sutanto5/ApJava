package Unit5_WritingClasses.VillainLab;

import Unit5_WritingClasses.VillainLab.Power;

public class SuperHero {
    private String heroName;
    private Power superPower;
    private static int numHeroes = 0;
    private static int totalStrength = 0;

    //constructor
    public SuperHero(String heroName, Power superPower) {
        //Somebody called the constructor so we're creating a new Superhero object - update the count
        numHeroes++;

        totalStrength += superPower.getStrength();

        this.heroName = heroName;
        //creates a new copy of superpower
        this.superPower = new Power(superPower.getPower(), superPower.getStrength());
    }

    //getters and setters
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {

        this.superPower = superPower;
    }

    public static int getNumHeroes() {
        return numHeroes;
    }

    public static void setNumHeroes(int numHeroes) {
        SuperHero.numHeroes = numHeroes;
    }

    public static int getTotalStrength() {
        return totalStrength;
    }

    public static void setTotalStrength(int totalStrength) {
        SuperHero.totalStrength = totalStrength;
    }

    //returns description
    public String toString() {
        return "SuperHero:\n\t" +
                "Name: " + heroName + "\n\t" +
                superPower.toString();
    }

    //gets the average strength of the heroes
    public static double averageStrength(){

        return (double)totalStrength/numHeroes;

    }
}
