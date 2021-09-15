package Unit3_BooleansIfStatements.homework;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    //constructor created by intelliJ
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = 0; //default is 0 with no toppings
        this.isDeepDish = isDeepDish;
    }

    public void printInfo(){
        System.out.println("Store name:" + this.store);
        System.out.println("Size (inches): " +this.inches);
        System.out.println("Toppings: " + this.numToppings);
        System.out.println("DeepDish: " + this.isDeepDish + "\n");
    }
    //equals method: returns true if the 2 pizzas are equal false otherwise
    //we're going to cheat and say 2 pizzas are equal if they're from the sameStore
    public boolean equals(Pizza other){
        boolean sameStore = this.store.equals(other.store);
        return sameStore;
    }

    //outputs pizza's info in string
    public String toString(){
        String pizzaInfo = "Store: " + this.store +  "\nSize(inches): " + this.inches + "\nTopppings: " + this.numToppings + "\nDeep Dish: " + this.isDeepDish;
        return pizzaInfo;
    }

    /*
    //self-made constructors

    //constructor with all variables
    public Pizza(String storeName, int measurement, int toppings, boolean deepDish){
        store = storeName;
        inches = measurement;
        numToppings = toppings;
        isDeepDish = deepDish;
    }

    //constructor with no toppings
    public Pizza(String name, int measurement, boolean deepDish){
        store = name;
        inches = measurement;
        numToppings = 0;
        isDeepDish = deepDish;
    }*/

    //getters and setters
    public String getStore() {
        return store;
    }

    public int getInches() {
        return inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}

