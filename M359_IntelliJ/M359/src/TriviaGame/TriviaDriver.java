package TriviaGame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.*;
import javax.sound.sampled.*;

public class TriviaDriver {
    public static final String GREEN = "\u001b[32m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001b[31m";

    public static void main(String[] args) throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {

        Scanner player = new Scanner(System.in);


        boolean isDone = false;
        int count = 0;
        playMusic();

        //While the player is playing
        while (!isDone) {
            TriviaGame.gameIntro();

            // gets player name
            System.out.println("Player what is your name: ");
            String name = player.nextLine();
            System.out.println();

            Question.makeHard();
            TriviaGame trivia = new TriviaGame(TriviaGame.chooseCategory());
            Question[] questions = trivia.getTriviaQs();

            System.out.println();
            //run the game
            isDone = TriviaGame.runGame(questions, name);

        }
        System.out.println();
        System.out.println("**********************");
        System.out.println("Thank you for playing!");
        System.out.println("**********************");

    }

    /**
     This method plays Jeopardy music
     */
    public static void playMusic () throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException, FileNotFoundException {
        File wrong = new File("Jeopardy think music.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(wrong);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        clip.loop(100);
    }

}
