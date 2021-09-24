package Unit3_BooleansIfStatements.homework.ChevroletLab;

public class Chevy {
    //instance variables
    private int year, mileage, price;
    private double fuelEfficiency;
    private String model, color;
    private boolean lPackageStatus, wPackageStatus, sPackageStatus;

    //constants
    final String make = "Chevrolet";
    final double taxRate = 0.122,
            luxuryIncrease = 0.2, sportsIncrease = .15, fuelDeduction = -.20;
    final int wDPrice = 3500;

    //default constructor
    public Chevy() {
        year = 2021;
        mileage=0;
        price = 16000;
        fuelEfficiency = 35;
        model = "Trax";
        color = "white";
        lPackageStatus = false;
        wPackageStatus = false;
        sPackageStatus = false;
    }

    //constructor that customizes all values
    public Chevy(int year, int mileage, double fuelEfficiency, int price, String model, String color,
                 boolean lPackageStatus, boolean wPackageStatus, boolean sPackageStatus) {
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.fuelEfficiency = fuelEfficiency;
        this.model = model;
        this.color = color;
        this.lPackageStatus = lPackageStatus;
        this.wPackageStatus = wPackageStatus;
        this.sPackageStatus = sPackageStatus;
    }

    //compares the price of two Chevy's
    //returns positive if the first price is greater than the other
    //returns negative if the first price is less than the other
    //returns 0 if both prices are the same
    public int compareTo(Chevy other){
        return (this.price - other.price);
    }

    //checks if model color and mileage status are equal to each other
    public boolean equalsTo(Chevy other){

        if (this.model.equals(other.model) && this.color.equals(other.color)){
            return (this.mileage < 200 && other.mileage <200 || this.mileage >=200 && other.mileage >=200);
        } else{
            return false;
        }
    }

    //Description of car
    public String toString(){
        String description = color + " " + year + " " + model + " with " + mileage + " miles that costs"
                + price + ".\n The truck gets " + fuelEfficiency;
        if(wPackageStatus == true){
            if(lPackageStatus == true) {
                if(sPackageStatus == true){
                    description += "has both a 4WD and luxury package.\n\t" + year + " " + model +
                            "(" + color + ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                            + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                            "\n\tPACKAGES:\n\t\t-Luxury Package\n\t\t-4WD Package\n\t\t-Sports Package";
                    return description;
                } else{
                    description += "has both a 4WD and luxury package.\n\t" + year + " " + model +
                            "(" + color + ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                            + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                            "\n\tPACKAGES:\n\t\t-Luxury Package\n\t\t-4WD Package\n\t\t";
                    return description;
                }

            }else if(sPackageStatus == true){
                description += "has both a 4WD and luxury package.\n\t" + year + " " + model +
                        "(" + color + ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                        + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                        "\n\tPACKAGES:\n\t\t-Sports Package\n\t\t-4WD Package";
                return description;
            } else{
                description += "has both a 4WD and luxury package.\n\t" + year + " "+ model +
                        "("+color+ ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                        + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                        "\n\tPACKAGES:\n\t\t-4WD Package";
                return description;
            }
        } else if(lPackageStatus == true){
            if(sPackageStatus == true){
                description += "has both a 4WD and luxury package.\n\t" + year + " "+ model +
                        "("+color+ ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                        + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                        "\n\tPACKAGES:\n\t\t-Luxury Package\n\t\t-Sports Package";
                return description;
            }else{
                description += "has both a 4WD and luxury package.\n\t" + year + " "+ model +
                        "("+color+ ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                        + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                        "\n\tPACKAGES:\n\t\t-Luxury Package";
                return description;
            }
        } else if(sPackageStatus == true){
            description += "has both a 4WD and luxury package.\n\t" + year + " "+ model +
                    "("+color+ ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                    + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                    "\n\tPACKAGES:\n\t\t-Sports Package";
            return description;
        } else{
            description += "has both a 4WD and luxury package.\n\t" + year + " "+ model +
                    "("+color+ ")\n\t\tPRICE:\t\t" + price + "" + "\n\t\tMiles:\t\t" + mileage
                    + "\n\t\tFUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +
                    "\n\tPACKAGES:\n\t\t-None";
            return description;
        }
    }

    //calcs price of car including packages
    public double calcPrice(){
        if(lPackageStatus == true){
            price += (price * luxuryIncrease);
        }
        if(wPackageStatus == true){
            price += wDPrice;
        }
        if(sPackageStatus == true){
            price += (price * sportsIncrease);
        }
        price += (price *taxRate);
        return price;
    }

    //Getters and Setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean islPackageStatus() {
        return lPackageStatus;
    }

    public void setlPackageStatus(boolean lPackageStatus) {
        this.lPackageStatus = lPackageStatus;
    }

    public boolean iswPackageStatus() {
        return wPackageStatus;
    }

    public void setwPackageStatus(boolean wPackageStatus) {
        this.wPackageStatus = wPackageStatus;
    }

    public boolean issPackageStatus() {
        return sPackageStatus;
    }

    public void setsPackageStatus(boolean sPackageStatus) {
        this.sPackageStatus = sPackageStatus;
    }

}
