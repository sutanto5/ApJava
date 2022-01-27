package TicketMasterLab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicektMasterDriver {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Scanner myScan = new Scanner(System.in);

        //Intro
        System.out.println("********************************************************");
        System.out.println("\t\t\t  Welcome to TicketMaster!");
        System.out.println("********************************************************");

        while(true) {
            TicketMaster ticket = new TicketMaster();
            ticket.setShows(ticket.kioskIntro(myScan));
            System.out.println(ticket);
        }

        //Sorted AtoZ
        //System.out.println();
        //ArrayList<Show> sorted = ticket.sortAToZ();
        //for (Show x: sorted){
        //    System.out.println(x);
        //}
//
        ////Sorted ZtoA
        //System.out.println();
        //ArrayList<Show> sort = ticket.sortZtoA();
        //for (Show x: sort){
        //    System.out.println(x);
        //}


        /*High Price
        System.out.println("Highs: ");
        ArrayList<Show> highPrice = ticket.sortByHighPrice();
        for(Show x: highPrice){
            System.out.println(x);
        }


        //Low price
        /*
        System.out.println("Lows: ");
        ArrayList<Show> lowPrice = ticket.sortByLowPrice();
        for(Show x: lowPrice){
            System.out.println(x);
        }


    /*Choose City
        System.out.println("Choose a city:");
        String city = read.nextLine();
        ArrayList<Show> shows = ticket.searchByCity(city);
        for(Show x: shows){
            System.out.println(x);
        }

    /*Choose price

        System.out.println("Choose a price:");
        Double price = read.nextDouble();

        System.out.println();
        ArrayList<Show> cool = ticket.searchByPrice(price);
        for(Show x: shows){
          System.out.println(x);
        }

    */
    }
}
