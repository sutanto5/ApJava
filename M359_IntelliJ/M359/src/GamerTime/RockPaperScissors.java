package GamerTime;

import java.util.Scanner;


public class RockPaperScissors {
    public static final String RESET = "\u001B[0m";

    public static final String GREEN = "\u001B[32m";

    public static final String RED = "\u001B[31m";


    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        //The computers randomized choive
        String choice = computerRockPaperScissors();

        //users choice
        System.out.println(" Choose Rock, Paper, or Scissors");
        String userChoice = scan.nextLine();

        //prints the computer's choice
        System.out.println("You chose:");
        Thread.sleep(800);
        System.out.println(showChoice(userChoice));
        Thread.sleep(800);
        System.out.println();

        //prints vs
        System.out.println("VS");
        System.out.println();
        Thread.sleep(800);

        //prints comp choice
        System.out.println("The Computer chose:");
        Thread.sleep(800);
        System.out.println(showChoice(choice));

        //prints winner
        System.out.println();
        chooseWinner(userChoice, choice);

    }

    public static String computerRockPaperScissors(){
        int choice = (int)(Math.random() * 3) + 1;
        if(choice ==1){
            return "rock";
        }
        if(choice == 2){
            return "scissors";
        }
        else{
            return "paper";
        }
    }

    public static String showChoice(String choice) {
        String rock = "";
        rock += "    _______\n";
        rock += "---'   ____)\n";
        rock += "      (_____)\n";
        rock += "      (_____)\n";
        rock += "      (____)\n";
        rock += "---.__(___)\n";

        String scissors = "";
        scissors += "    _______\n";
        scissors += "---'   ____)____\n";
        scissors += "          ______)\n";
        scissors += "       __________)\n";
        scissors += "      (____)\n";
        scissors += "---.__(___)\n";

        String paper = "";
        paper += "     _______\n";
        paper += "---'    ____)____\n";
        paper += "           ______)\n";
        paper += "          _______)\n";
        paper += "         _______)\n";
        paper += "---.__________)\n";

        if (choice.equalsIgnoreCase("paper")) {
            return paper;
        }
        if (choice.equalsIgnoreCase("rock")) {
            return rock;
        } else {
            return scissors;
        }
    }
    public static void chooseWinner(String choice, String compChoice){
        if(choice.equalsIgnoreCase("rock")) {
            if (compChoice.equalsIgnoreCase("rock")) {
                System.out.println("IT IS A TIE");
            }
            if (compChoice.equalsIgnoreCase("paper")) {
                System.out.println(RED + "YOU HAVE LOST");
            }
            if (compChoice.equalsIgnoreCase("scissors")) {
                System.out.println(GREEN + "YOU HAVE WON");
            }
        }
        if(choice.equalsIgnoreCase("scissors")) {
            if (compChoice.equalsIgnoreCase("rock")) {
                System.out.println(RED + "YOU HAVE LOST");
            }
            if (compChoice.equalsIgnoreCase("paper")) {
                System.out.println(GREEN + "YOU HAVE WON");
            }
            if (compChoice.equalsIgnoreCase("scissors")) {
                System.out.println("IT IS A TIE");
            }
        }
        if(choice.equalsIgnoreCase("paper")){
            if(compChoice.equalsIgnoreCase("rock")){
                System.out.println(GREEN + "YOU HAVE WON");
            }
            if(compChoice.equalsIgnoreCase("paper")){
                System.out.println("IT IS A TIE");
            }
            if(compChoice.equalsIgnoreCase("scissors")){
                System.out.println(RED + "YOU HAVE LOST");
            }

    }



    }
}
