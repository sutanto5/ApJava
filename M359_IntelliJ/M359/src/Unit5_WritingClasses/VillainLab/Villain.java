package Unit5_WritingClasses.VillainLab;

import Unit5_WritingClasses.VillainLab.Power;

public class Villain {
    private String villainName;
    private Power superPower;
    private static int numVillains = 0;
    private static int totalStrength = 0;


    public Villain(String villainName, Power superPower) {
        numVillains++;
        totalStrength += superPower.getStrength();
        this.villainName = villainName;
        //creates a new copy of superpower
        this.superPower = new Power(superPower.getPower(), superPower.getStrength());
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public static int getNumVillains() {
        return numVillains;
    }

    public static void setNumVillains(int numVillains) {
        Villain.numVillains = numVillains;
    }

    public static int getTotalStrength() {
        return totalStrength;
    }

    public static void setTotalStrength(int totalStrength) {
        Villain.totalStrength = totalStrength;
    }

    public String toString() {
        return "Villain:\n\t" +
                "Name: " + villainName + "\n\t" +
                superPower.toString();
    }

    //gets the average strength of the heroes
    public static double averageStrength(){

        return (double)totalStrength/numVillains;

    }

}
