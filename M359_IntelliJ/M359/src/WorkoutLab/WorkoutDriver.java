package WorkoutLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        intro();
        System.out.println();
        int num = 0;

        System.out.print("Amount of weeks for WorkoutPlan: ");
        num = scan.nextInt();

        System.out.println("Please print an integer");


        scan.nextLine();
        System.out.println();

        WorkoutPlan workout = new WorkoutPlan(num);
        System.out.println("Great let's Look at your " + num + " week workout plan");
        System.out.println(workout);

        while(true) {
            System.out.println("Would you like to simulate the week? Type Start");
            String ans = scan.nextLine();

            if (ans.equalsIgnoreCase("Start")) {

                workout.endWorkout();
                workout.workoutNextWeek();
                workout.printProgress();

            }

        }

    }
    public static void intro(){
        System.out.println("***************************************");
        System.out.println("    WELCOME TO THE WORKOUT PLANNER!    ");
        System.out.println("***************************************");



    }



}
