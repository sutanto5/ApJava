package Unit5_WritingClasses.VillainLab;

import java.text.DecimalFormat;

public class Power {
    private String power;
    private double strength;


    public Power(String power, double strength){
        this.power = power;
        this.strength = strength;
    }

    //getters and setters
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    //returns descritpion
    public String toString() {
        DecimalFormat twoDecimals = new DecimalFormat("###.##");
        return "Power: "+ power + "\n\t" +
                "Strength: " + twoDecimals.format(strength);
    }
}
