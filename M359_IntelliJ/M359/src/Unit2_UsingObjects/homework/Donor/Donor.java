package Unit2_UsingObjects.homework.Donor;

public class Donor {
    private double moneyDonated;
    private String name;
    private String charity;
    private boolean anonymous;

    //constructors
    public Donor(double amount, String donorName, String cause, boolean isAnonymous){
        moneyDonated = amount;
        name = donorName;
        charity = cause;
        anonymous = isAnonymous;
    }

    public Donor(double amount, String donorName, String cause){
        moneyDonated = amount;
        name = donorName;
        charity = cause;
        anonymous = false;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getCharity(){
        return charity;
    }

    public double getMoneyDonated(){
        return moneyDonated;
    }

    public boolean getAnonymous(){
        return anonymous;
    }

    //setters
    public void setMoneyDonated(double moneyAmount){
        moneyDonated = moneyAmount;
    }

    public void setName(String nombre){
        name = nombre;
    }

    public void setCharity(String cause){
        charity = cause;
    }

    public void setAnonymous(boolean isAnonymous){
        anonymous = isAnonymous;
    }

    //methods
    public void addMoney(double moneyAmount){
        moneyDonated += moneyAmount;
    }

    public void makeAnonymous(){
        name = "Anonymous";
        anonymous = true;
    }
}
