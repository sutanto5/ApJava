package WorkoutLab;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        playMusic();
        intro();

        System.out.println();

        int num = 0;
        boolean notNum = true;

        while(notNum) {
            try {

                System.out.println("Amount of weeks for WorkoutPlan: ");
                num = scan.nextInt();
                scan.nextLine();    // dummy read
                if(num < 0){
                    throw InputMismatchException;
                }
                notNum = false;


            } catch (InputMismatchException e) {
                System.out.println("Please put in an integer");
                scan.nextLine();    // dummy read from the nextInt()
            }
        }

        System.out.println();
        WorkoutPlan workout = new WorkoutPlan(num);

        System.out.println("Great let's Look at your " + num + " week workout plan");
        System.out.println(workout);

        while(true) {

            System.out.println("Would you like to simulate the week? Type Start");
            String ans = "";
            ans = scan.nextLine();

            if (ans.equalsIgnoreCase("Start")) {

                workout.endWorkout();
                workout.workoutNextWeek();
                workout.printProgress();

            } else{
                System.out.println(motivationalMessage());
            }

        }

    }
    public static void intro(){
        System.out.println("***************************************");
        System.out.println("    WELCOME TO THE WORKOUT PLANNER!    ");
        System.out.println("***************************************");



    }

    /**
     * returns a motivational message when the user does not want to start the next week
     * @return a quote with a motivational message
     * @throws FileNotFoundException
     */
    public static String motivationalMessage() throws FileNotFoundException {
        ArrayList<String> quotes = new ArrayList<>();
        File quoteFile =new File("MotivationalMsg.txt");
        Scanner fileIn = new Scanner(quoteFile);
        while(fileIn.hasNextLine()) {
            quotes.add(fileIn.nextLine());
        }
        int length = quotes.size();
        int rand = (int)(Math.random() * length);
        return quotes.get(rand);
    }

    public static void chooseMusic(){

    }
    /**
     This method plays Jeopardy music
     */
    public static void playMusic () throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException, FileNotFoundException {
        File wrong = new File("[ONTIVA.COM] Kanye West - POWER (Clean) (Radio Edit)-HQ.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(wrong);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        clip.loop(100);
    }



}
