package Unit3_BooleansIfStatements.examples.ReviewExample;

public class Review {
    private String name;
    private String business;
    private int rating;

    //constructor
    public Review(String aName, String aBusiness, int aRating){
        this.name = aName;
        this.business = aBusiness;
        this.rating = aRating;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        String fullReview = "Business: " + this.business + "\nName: " + this.name + "\nRating: " +this.rating + "\n";
        if(this.rating == 5){
            fullReview += "\t**Highly Recommended\n";
        } else if(this.rating ==1){
            fullReview += "\t**Strongly Discouraged\n";
        }
        return fullReview.toUpperCase();

    }
}
