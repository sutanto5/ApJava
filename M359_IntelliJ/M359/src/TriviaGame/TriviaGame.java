package TriviaGame;

import java.text.DecimalFormat;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.*;


public class TriviaGame{

    //Constants for color changes
    public static final String GREEN = "\u001b[32m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001b[31m";

    //instance variable
    private Question[] triviaQs;

    //global variables
    public static int totalPts = 0;
    public static int streak = 0;
    public static int numAnswered = 0;
    public static int numCorrect = 0;

    //getters and setters
    public Question[] getTriviaQs() {
        return triviaQs;
    }

    public void setTriviaQs(Question[] triviaQs) {
        this.triviaQs = triviaQs;
    }

    public int getTotalPts() {
        return totalPts;
    }

    public void setTotalPts(int totalPts) {
        this.totalPts = totalPts;
    }

    //Constructor
    public TriviaGame(String category) throws FileNotFoundException{
        this.triviaQs = readText(category);
    }

    /**
     *This method reads the file of questions that the player has chosen
     *@param file the link of the file with the chosen questions
     *@return returns the a question array filled with all the questions
     */
    public Question[] readText(String file) throws FileNotFoundException {
        File questionFile = new File(file);
        Scanner fileIn = new Scanner(questionFile);
        int amount = fileIn.nextInt();
        Question[] myQs = new Question[amount];
        int questionAmount = 0;

        fileIn.nextLine();

        while(fileIn.hasNextLine()){

            String question = fileIn.nextLine();

            String[] choices = new String[4];
            for(int i = 0; i < 4; i++){
                choices[i] = fileIn.nextLine();
            }

            int ptVal = fileIn.nextInt();
            fileIn.nextLine();

            String correctAns= fileIn.nextLine();

            Question trivia = new Question(question, choices, correctAns, ptVal);
            myQs[questionAmount] = trivia;
            questionAmount++;
        }

        return myQs;

    }

    /**
     * allows you to choose what category you want
     * @return the string of the file name which corresponds to your choice
     */
    public static String chooseCategory() {
        Scanner player = new Scanner(System.in);
        System.out.println("Which category do you want to choose - Type the letter: ");
        System.out.println("  A. Math");
        System.out.println("  B. History");
        System.out.println("  C. Sports");
        System.out.println("  D. Chemistry");
        System.out.println("  The default is Spanish");
        String ans = player.nextLine();
        if (ans.equalsIgnoreCase("A")) {
            return "Math.txt";
        } else if (ans.equalsIgnoreCase("B")) {
            return "History.txt";
        } else if (ans.equalsIgnoreCase("C")) {
            return "Sports.txt";
        } else if (ans.equalsIgnoreCase("D")) {
            return "Chemistry.txt";
        } else {
            return "Spanish.txt";

        }
    }

    /**
     * his method runs all facets of the game
     * @param triviaQs the questions being used in the game
     * @param playerName the name of the player
     * @return boolean on whether or not the game will continue running
     */
    public static boolean runGame(Question[] triviaQs, String playerName) throws InterruptedException {
        Scanner player = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("###.00");

        while (true) {
            System.out.println();

            if(triviaQs.length != 0) {
                System.out.println("Player: " + playerName + " | Give Question: type Y or N");
                String ans = player.nextLine();
                //when player wants to continue playing
                if (ans.equalsIgnoreCase("Y")) {
                    System.out.println();

                    //randomly generate a question
                    int rand = (int) (Math.random() * triviaQs.length);
                    System.out.println(triviaQs[rand]);
                    System.out.println();

                    //player fills in answer regardless of capitals
                    if (player.nextLine().equalsIgnoreCase(triviaQs[rand].getCorrectAnswer())) {

                        //the player got it right, update score and questions
                        System.out.println(GREEN + "You got the correct answer" + RESET);
                        System.out.println();
                        updateScore(true, triviaQs, rand);
                        triviaQs = removeIndex(triviaQs, rand);
                        printScore(playerName);
                        System.out.println();

                        //keeps track of player score
                        numCorrect++;
                        numAnswered++;
                    } else {

                        //The player got it wrong, update score, and questions
                        System.out.println(RED + "That was the wrong answer!" + RESET);
                        System.out.println("The correct answer was " + triviaQs[rand].getCorrectAnswer());
                        updateScore(false, triviaQs, rand);
                        triviaQs = removeIndex(triviaQs, rand);
                        printScore(playerName);

                        //keeps track of player score
                        numAnswered++;
                    }

                } else if (ans.equalsIgnoreCase("N")) {

                    // asks player if they want to play again
                    System.out.println();
                    printScore(playerName);
                    System.out.println();
                    System.out.println("Questions answered correctly: " + numCorrect);
                    System.out.println("Percentage of questions correct: " + twoDecimals.format((double)numCorrect/numAnswered));
                    System.out.println();
                    System.out.println("Restart the game?  Type Y");

                    // if yes restart game
                    if (player.nextLine().equalsIgnoreCase("Y")) {
                        System.out.println("Fetching data...");
                        System.out.println();

                        System.out.print("\tResetting Data");

                        //restart effect
                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);

                        System.out.print("\b");
                        Thread.sleep(800);
                        System.out.print("\b");
                        Thread.sleep(800);
                        System.out.print("\b");

                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);
                        System.out.print(".");
                        Thread.sleep(800);
                        System.out.println();
                        System.out.println();

                        TriviaGame.totalPts = 0;
                        TriviaGame.streak = 0;

                        return false;

                    } else {
                        return true;
                    }

                } else {
                    System.out.println("Oops You mistyped");
                }

                //very not intuitive repition of code but it restarts game when cards are 0
            } else{
                printScore(playerName);
                System.out.println();
                System.out.println("Questions answered correctly: " + numCorrect);
                System.out.println("Percentage of questions correct: " + twoDecimals.format((double)numCorrect/numAnswered));
                System.out.println();
                System.out.println("Restart the game?  Type Y");

                // if yes restart game
                if (player.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println("Fetching data...");
                    System.out.println();
                    System.out.print("\tResetting Data");

                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);

                    System.out.print("\b");
                    Thread.sleep(800);
                    System.out.print("\b");
                    Thread.sleep(800);
                    System.out.print("\b");

                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.println();
                    System.out.println();

                    totalPts = 0;
                    streak = 0;
                    numAnswered = 0;
                    numCorrect = 0;

                    return false;

                } else {
                    return true;
                }
            }

        }
    }

    /**
     *This method updates the score of the playe based on whether they got it right or wrong
     *@param correct whether they got the question right or wrong
     * @param triviaQs the questions being used in the current game
     * @param questionNum the question printed previously
     */
    public static void updateScore(boolean correct, Question[] triviaQs, int questionNum) {
        if (correct) {
            // adds to pts and streak
            totalPts += triviaQs[questionNum].getPointVal();
            streak++;
        } else {
            // subtracts point value
            totalPts -= triviaQs[questionNum].getPointVal();
            // resets streak
            streak = 0;
        }

    }

    /**
     * This method prints out the current score of the player
     * @ param playerName the name of the current player
     */
    public static void printScore(String playerName) {
        // prints out the players score
        System.out.println("****************************");
        System.out.println("Player: " + playerName);
        System.out.println("Score: " + totalPts);
        System.out.println("Streak: " + streak);
        System.out.println("***************************");
    }

    /**
     * This method removes the index of the previously printed question
     * @param triviaQs question deck being removed from
     * @param index question printed
     * @return newQs an array without the used index
     */
    public static Question[] removeIndex(Question[] triviaQs, int index){
        Question[] newQs = new Question[triviaQs.length-1];
        int count = 0;

        //Runs through each non used index of triviaQs and duplicates it in to newQs
        for(int i = 0; i < triviaQs.length; i++){
            if(i != index){
                newQs[count] = triviaQs[i];
                count++;
            }
        }

        if(newQs.length == 0){
            System.out.println();
            System.out.println("There are no cards left in the deck");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("There are " + newQs.length + " cards left in the deck");
            System.out.println();
        }
        return newQs;
    }

    /**
     This method prints out an introduction for the game
     */
    public static void gameIntro() {

        // Bad Ascii art attempt
        System.out.println("        |||||||                ");
        System.out.println("       |||   |||            ");
        System.out.println("      |||     |||         ");
        System.out.println("       ||||    |||          ");
        System.out.println("        ||||               ");
        System.out.println("          |||              ");
        System.out.println("          |||              ");
        System.out.println("                            ");
        System.out.println("          |||              ");
        System.out.println("          |||              ");

        // intro
        System.out.println("***************************************");
        System.out.println("Welcome to this very cool Trivia Game!!");
        System.out.println("***************************************");

        //Rules
        System.out.println("***************************************");
        System.out.println("To answer the question type the answer ");
        System.out.println("you think is correct as spelled in the ");
        System.out.println("question. Have fun!");
        System.out.println("***************************************");

    }

}



