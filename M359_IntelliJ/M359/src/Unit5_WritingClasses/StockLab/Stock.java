package Unit5_WritingClasses.StockLab;

public class Stock {
    private String stockTicker;
    private double stockPrice;
    private double prev52WkRange;
    public double current52WkRange = 0;

    public Stock(){
        stockTicker = "";
        stockPrice = 0;
        prev52WkRange = 0;
        current52WkRange = prev52WkRange;
    }

    public Stock(String abbrev, double price, double range){
        stockTicker = abbrev;
        stockPrice = price;
        prev52WkRange = range;
    }

    public double getCurrent52WkRange(){
        return current52WkRange;
    }

    public void setCurrent52WkRange(double range){
        this.current52WkRange = range;
    }

    public String getStockTicker(){
        return stockTicker;
    }

    public void setStockTicker(String abbrev){
        this.stockTicker = abbrev;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double getPrev52WkRange() {
        return prev52WkRange;
    }

    public void setPrev52WkRange(double prev52WkRange) {
        this.prev52WkRange = prev52WkRange;
    }

    public String toString(){
        return "Stock: " + stockTicker + "\nPrice: " + stockPrice + "\n52wk Range: " + prev52WkRange;
    }

}

