package Unit5_WritingClasses.StockLab;

import java.util.Scanner;
public class News {

    // RESET SO we reset the color when it needs to be normal
    public static final String RESET = "\u001B[0m";

    public static final String GREEN = "\u001B[32m";

    public static final String RED = "\u001B[31m";

    public static int FLUCTUATION = 1000;


    private boolean isGood;
    // intensity is between 1,2, or 3
    private int intensity;

    public News(boolean newsType, int rating) {
        isGood = newsType;
        intensity = rating;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public void makeCrazy(){
        Scanner user = new Scanner(System.in);

        System.out.println("These days crypto are on the rise. We can make your stock simulate like a crypto stock?\nType Y for CRAZY!!!!: ");

        if(user.nextLine().equals("Y")){
            FLUCTUATION = 100;
        }

        System.out.println();

    }

    /**
     * Randomizes the values of the  regarding the stock and the company. The news
     * has a 60 percent chance of being good and a 40 percent chance of being bad.
     * Severity is also randomized and is in between 1-10
     *
     * if good:
     *  *stock will increase bassed on severity -
     *  *  *severity <= 4: intensity of the news is set to 1
     *  *  *4 < severity <= 8: intensity will be set to 2 and a statement will
     *print
     * *  *severity >8: intensity will be set to 3 and a statemwent will print
     *
     * @param news This is the News object
     */
    public void randomizeNews(News news) {
        int rand = (int) (Math.random() * 10) + 1;
        int severity = (int) (Math.random() * 10) + 1;

        if (rand <= 4) {

            isGood = false;
            if (severity <= 4) {
                intensity = 1;
                System.out.println(RED + "The company will take a minor hit next week" + RESET);
            } else if (severity <= 8) {
                intensity = 2;
                System.out.println(RED + "The company will take a hit next week" + RESET);
            } else {
                intensity = 3;
                System.out.println(RED + "Wall Street just pooped on Wall Street" + RESET);
                //Best String ever
            }


        } else {

            isGood = true;
            if (severity <= 4) {
                intensity = 1;
                System.out.println(GREEN + "The company will see a slight boost next week" + RESET);

            } else if (severity <= 8) {
                intensity = 2;
                System.out.println(GREEN + "The company will see a sizeable boost next week" + RESET);
            } else {
                intensity = 3;
                System.out.println(GREEN + "The company will be raking in dough next week" + RESET);
            }
        }
        System.out.println();
    }

    /**The Simulate news function does exactly what it name says: it simulated the news
     *The purpose of this is to incorporate the news into the stock's value and growth. This due to because in real life, some good or bad articles could determine your stock's value
     *
     * @param stock
     *
     */
    public void simulateNews(Stock stock) { // *range + start

        double percent = 0;
        double price = stock.getStockPrice();
        double difference = 0;
        if (isGood) {
            if (intensity == 3) {
                // 100-70
                percent = (int) (Math.random() * 31) + 70;
            } else if (intensity == 2) {
                // 69-40
                percent = (int) (Math.random() * 30) + 40;
            } else {
                // 39 - 0
                percent = (int) (Math.random() * 40);
            }
            percent = percent / FLUCTUATION;
            difference = price * percent;
            price += difference;
            stock.setStockPrice(price);
        } else {
            if (intensity == 3) {
                // 100-70
                percent = (int) (Math.random() * 31) + 70;
            } else if (intensity == 2) {
                // 69-40
                percent = (int) (Math.random() * 30) + 40;
            } else {
                // 39 - 0
                percent = (int) (Math.random() * 40);
            }
            percent = percent / FLUCTUATION;
            difference = price * percent;
            price -= difference;
            stock.setStockPrice(price);
        }

    }
}

