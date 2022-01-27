package TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicketMaster {
    private ArrayList<Show> Shows;


    public TicketMaster() throws FileNotFoundException {
        this.Shows = readShows();
    }

    public ArrayList getShows() {
        return Shows;
    }

    public void setShows(ArrayList shows) {
        Shows = shows;
    }

    public ArrayList<Show> readShows() throws FileNotFoundException {
        File showFile = new File("showData.txt");
        //change this later to make one scanner
        Scanner read = new Scanner(showFile);
        ArrayList<Show> showList = new ArrayList();

        while (read.hasNextLine()) {
            String date = read.next();
            double price = read.nextDouble();
            int quantity = read.nextInt();
            String temp = read.nextLine();
            int ind = temp.indexOf(",");
            String performer = temp.substring(0, ind);
            String city = temp.substring(ind + 2);

            Show newShow = new Show(date, price, quantity, performer, city);

            showList.add(newShow);
        }

        return showList;
    }

    public String toString() {
        String output = "";

        output += "Date";
        output += "\t\tPrice";
        output += "\t\tQty";
        output += "\t\t Performer";
        output += "\t\tCity\n";

        output += "--------------------------------------------------------\n";
        for (Show x : Shows) {
            output += x;
            output += "\n";
        }
        return output;
    }

    /**
     * sorts by city
     * @param choice
     * @return list of shows with cities according to choice
     */
    public ArrayList<Show> searchByCity(String choice) {
        ArrayList<Show> showsInCity = new ArrayList<>();

        for (Show x : Shows) {
            if (x.getCity().equals(choice)) {
                showsInCity.add(x);
            }
        }

        return showsInCity;
    }

    /**
     * searches by price
     * @param price
     * @return
     */
    public ArrayList<Show> searchByPrice(double price) {
        ArrayList<Show> showsByPrice = new ArrayList<>();

        for (Show x : Shows) {
            if (x.getPrice() <= price) {
                showsByPrice.add(x);
            }
        }

        return showsByPrice;
    }

    /**
     *
     * @return
     */
    public ArrayList<Show> sortByHighPrice() {
        ArrayList<Show> dupe = Shows;
        ArrayList<Show> showsByPrice = new ArrayList<>();

        while (dupe.size() > 0) {

            int ind = 0;
            for (int i = 0; i < dupe.size(); i++) {
                if (dupe.get(ind).getPrice() < dupe.get(i).getPrice()) {
                    ind = i;
                }
            }

            showsByPrice.add(dupe.remove(ind));

        }
        Shows = showsByPrice;
        return showsByPrice;
    }

    /**
     *
     * @return
     */
    public ArrayList<Show> sortByLowPrice() {
        ArrayList<Show> dupe = Shows;
        ArrayList<Show> showsByPrice = new ArrayList<>();

        while (dupe.size() > 0) {

            int ind = 0;
            for (int i = 0; i < dupe.size(); i++) {
                if (dupe.get(ind).getPrice() > dupe.get(i).getPrice()) {
                    ind = i;
                }
            }

            showsByPrice.add(dupe.remove(ind));

        }

        return showsByPrice;
    }

    /**
     *
     * @return
     */
    public ArrayList<Show>  sortAToZ() {

        for(int i = 0; i < Shows.size()-1; i++){

            int minInd = i;

            for(int j = i+1; j<Shows.size(); j++){
                if(Shows.get(j).getPerformer().compareTo(Shows.get(j).getPerformer()) < 0){
                    minInd = j;
                }
            }

            Show temp = Shows.get(i);
            Shows.set(i, Shows.get(minInd));
            Shows.set(minInd, temp);
            System.out.println(Shows);

        }
        return Shows;

    }

    public ArrayList<Show> sortZtoA(){
        for(int i = 0; i < Shows.size()-1; i++){

            int minInd = i;

            for(int j = i+1; j<Shows.size(); j++){
                if(Shows.get(j).getPerformer().compareTo(Shows.get(j).getPerformer()) > 0){
                    minInd = j;
                }
            }

            Show temp = Shows.get(i);
            Shows.set(i, Shows.get(minInd));
            Shows.set(minInd, temp);


        }

        return Shows;
    }

    /**
     *
     * @throws InterruptedException
     */
    public ArrayList<Show> kioskIntro(Scanner scanner) throws InterruptedException {



        //ascii art

        //choice list
        System.out.println("1. Search by City");
        System.out.println("2. Sort by Performer");
        System.out.println("3. Sort by Price");
        System.out.println("4. Sort A-Z");
        System.out.println("5. Sort Z-A");
        System.out.println("6. Sort by Ticket Prices Low");
        System.out.println("7. Sort by Ticket Prices High");
        System.out.println("8. Type 8 to quit");

        //Shows
        System.out.println();

        while (true) {

            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Choose a city: ");
                    String city = scanner.next();
                    return(searchByCity(city));

                }
                else if(choice == 2){
                    return null;

                }
                else if(choice == 3){
                    return null;

                }
                else if(choice == 4){
                    return sortAToZ();

                }
                else if(choice == 5){
                    return sortZtoA();

                }
                else if(choice == 6){
                    return sortByLowPrice();

                }
                else if(choice == 7){
                    return sortByHighPrice();

                }
                else if(choice == 8){

                    System.exit(20);

                }
            } catch (InputMismatchException e) {
                System.out.println("Please type a number 1-8");
                scanner.nextLine();


            }



        }

    }
}
