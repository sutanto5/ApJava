package GamerTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(chooseWord());

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

    public static void userGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a five letter word: ");

    }
}
