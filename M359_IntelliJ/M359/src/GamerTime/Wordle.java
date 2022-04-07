package GamerTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Wordle {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001b[33m";

    public static String[] firstRow = {"q","w","e","r","t","y","o","p"};
    public static String[] secondRow = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    public static String[] thirdRow  = {"z", "x", "c", "v", "b", "n", "m"};

    public static String[][] keyboard = {firstRow,secondRow,thirdRow};

    public static String compWord  = "";

    public static void main(String[] args) throws FileNotFoundException {
        compWord = chooseWord();
        System.out.println(compWord);

        for(int i = 0; i < 6; i++) {
            printAvailableletters();
            String recentGuess = userGuess();
            System.out.println(recentGuess);
            checkWord(recentGuess);
        }






    }

    /**
     * Chooses a random five letter word from a list
     * @return the random five letter word
     * @throws FileNotFoundException
     */
    public static String chooseWord() throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        File wordFile =new File("WordleWords.txt");
        Scanner fileIn = new Scanner(wordFile);
        while(fileIn.hasNextLine()) {
            words.add(fileIn.nextLine());
        }
        int length = words.size();
        int rand = (int)(Math.random() * length);
        return words.get(rand);
    }

    public static String userGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a five letter word: ");
        String guess = scan.nextLine();

        guess = compareWords(guess);


        return guess;
    }

    public static void printAvailableletters(){
        System.out.println("These are your available letters:");
        System.out.println();
        for(String[] x: keyboard){

            for(String y: x){
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String compareWords(String userWord){
        compWord = compWord.toLowerCase(Locale.ROOT);
        userWord = userWord.toLowerCase(Locale.ROOT);
        String[] letters = new String[5];
        for(int i = 0; i < 5; i++){
            letters[i] = userWord.substring(i,i+1);
        }

        //Compare if letters are in the computer word
        for(int i = 0; i < 5; i++){
            if(compWord.indexOf(letters[i]) > -1){
                //If in exact place
                if(compWord.indexOf(letters[i]) == i){
                    letters[i] = GREEN + letters[i] +RESET;
                }
                //if in word but not right place
                else{
                    letters[i] =  YELLOW + letters[i]+RESET;
                }
            }
        }

        String coloredWord = "";

        for (int i = 0; i < 5; i++){
            coloredWord += letters[i];
        }
        return coloredWord;
    }

    public static void checkWord(String userWord){
        if(userWord.equalsIgnoreCase(compWord)){
            System.out.println("You got the Word");
            System.exit(69);
        }
    }

}
