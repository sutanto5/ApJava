package Unit5_WritingClasses.StockLab;

//Joshua Sutanto, Enguerran Pretseille, Mr. Moon, Period 3

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tester {

    public static void main(String[] args) {

        Stock custom = new Stock();
        News def = new News(true, 1);
        Company apple = new Company("Apple", custom, def);

        System.out.println(News.FLUCTUATION);
        customizeStock(custom, apple);

        System.out.println(apple + "\n");
        yearSimulation(custom, apple, def);
        System.out.println(News.FLUCTUATION);

    }
    /**Asks the user what their company is, ticker, price, and 52 week range
     *      Modifies Company and Stock, and asks for the user input
     *      Prints out a set of questions and let's the user type into it in order to set the company and stock methods
     *
     *
     * @param stock The stock is of object type Stock
     * @param company The company is of object type company
     */
    public static void customizeStock(Stock stock, Company company) {
        Scanner user = new Scanner(System.in);
        System.out.println("Create Your Stock: ");

        System.out.println("\tWhat is your stock's Name (Ticker): ");
        stock.setStockTicker(user.nextLine());

        System.out.println("\tWhat is your Company's Name: ");
        company.setCompanyName(user.nextLine());

        System.out.println("\tWhat is your stock's value: ");
        stock.setStockPrice(user.nextDouble());
        stock.setCurrent52WkRange(stock.getStockPrice());

        System.out.println("\tHow much did your stock increase or decrease from last year: ");
        stock.setPrev52WkRange(user.nextDouble());

        System.out.println();
    }


    /**Simulates the yearly price fluctuation for the stock and prints out the weekly value changes
     *
     * @param stock The stock is of object type Stock
     * @param company The company is of object type company
     */
    public static void yearSimulation(Stock stock, Company company, News news) {
        Scanner newWeek = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("$#,###,#00.00");
        double previousStockPrice = 0;

        news.makeCrazy();


        for (int i = 1; i <= 52;) {
      /*
      if(stock.getStockPrice() < 1){
        System.out.println("The company went bankrupt");
        System.out.println();
        i=53;
      }*/

            //Simiulates the amount the stock will increase or decrease
            news.simulateNews(stock);

            // Below this line is only print out, no logic
            System.out.println("Info for " + stock.getStockTicker() + " for week "+ i + ":\n\tCompany Name: " + company.getCompanyName()
                    + "\n\tClosing Price for week "  + ": " + twoDecimals.format(stock.getStockPrice()) + "\n\tPrevious Stock Price "
                    + twoDecimals.format(previousStockPrice));


            //sets previous stock price to the current stock price
            previousStockPrice = stock.getStockPrice();

            //asks the user to click enter in order to advance the simulation
            System.out.println("\n\t\t press enter for next week");
            boolean isReading = true;
            while(isReading){
                String enter = "";
                enter = newWeek.nextLine();

                if(enter.equals("")){
                    isReading = false;
                    i++;
                    news.randomizeNews(news);
                }
            }


        }

        stock.setCurrent52WkRange(stock.getStockPrice() - stock.getCurrent52WkRange());
        System.out.println("\t\tThe new 52 week range is:\n\t\t\t" + twoDecimals.format(stock.getCurrent52WkRange()));
    }

}