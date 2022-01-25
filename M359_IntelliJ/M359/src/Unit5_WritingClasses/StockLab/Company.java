package Unit5_WritingClasses.StockLab;

public class Company{
    private String companyName;
    private Stock compStock;
    private News rep;

    //earnings
//for every 13 weeks (Q)
//Report earnings based off bool companyquarterearnings
//If is good increase the chance of risin
//If its bad increase the chance of decreasing prices.
//If it is on crazy mode then either increase or decrease earnings
    public Company(String companyName, Stock stock, News article) {
        this.rep = article;
        this.companyName = companyName;
        this.compStock = stock;
    }

    public String toString(){
        return "Company: " + companyName + "\n" + compStock.toString();
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public void setCompStock(Stock compStock) {
        this.compStock = compStock;
    }

    public void setRep(News rep) {
        this.rep = rep;
    }
}