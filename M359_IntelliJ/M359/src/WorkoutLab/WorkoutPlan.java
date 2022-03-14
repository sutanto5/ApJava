package WorkoutLab;

import javax.smartcardio.Card;
import java.util.Arrays;

public class WorkoutPlan {
    private int numWorkoutComplete;
    private int numWorkoutSkipped;
    private int curWeek;
    private int nextWorkoutNum;
    private int totalCalories;
    private int totalMin;
    private Workout[][] workouts;

    public WorkoutPlan(int numWeeks) {
        this.workouts = new Workout[numWeeks][7];
        fillWorkout();
        this.numWorkoutComplete = 0;
        this.numWorkoutSkipped = 0;
        this.curWeek = 0;
        this.nextWorkoutNum = 0;
        this.totalCalories = 0;
        this.totalMin = 0;
    }

    /**
     * fills the 2d array with randomized workouts
     */
    public void fillWorkout(){
        nextWorkoutNum++;

        //for each index of workout
        for(int row = 0; row < workouts.length; row++){
            for(int col = 0; col < workouts[0].length; col++){
                //random workout between 1 and 3
                int choice = (int)((Math.random() * 3) + 1);
                if(choice == 1){
                    workouts[row][col] = generateCardioWorkout(nextWorkoutNum);
                }
                if(choice == 2){
                    workouts[row][col] =generateStrength(nextWorkoutNum);
                }
                if(choice == 3){
                    workouts[row][col] = generateWellness(nextWorkoutNum);
                }

                nextWorkoutNum++;

            }
        }
    }

    /**
     * formats the workouts 2d array into a readable workout plan
     * @return output - the formatted workout plan
     */
    public String toString() {
        String output = "";
        int row = 0;
        for(int i = 0; i < workouts.length; i++){
            output += "*** WEEK #" + (row+1) + " ***";
            output += "\nWORKOUT NUM\t\tNAME\t\tMINUTES\n";
            for(int j = 0; j< workouts[0].length; j++){
                output += workouts[i][j].toString();
                output += "\n";
            }
            output+="\n";
            row++;
        }
        return output;
    }

    /**
     * generates a calorie workout with a randoized time and speed
     * @param workoutNum the number of the workout within the workout plan
     * @return run - the randomized Cardio workout
     */
    public Cardio generateCardioWorkout(int workoutNum){
        int time = (int)((Math.random() * 31) + 10);
        double speed = (Math.random() * 7) + 1;
        Cardio run = new Cardio("Running", workoutNum, time, speed);
        return run;
    }

    /**
     * generates a Strength workout with a randomized time and randomized weights
     * @param workoutNum the number of the workout within the workout plan
     * @return lift - a randomzied lifting workout
     */
    public Strength generateStrength(int workoutNum){
        int time = (int)((Math.random() * 46) + 15);
        int weight = (int)((Math.random() * 131) + 95);
        Strength lift = new Strength("Lifting", workoutNum, time, weight);
        return lift;
    }

    /**
     * generates a wellness workout with randomized time and number of stretches
     * @param workoutNum the number of the workout within the workout plan
     * @return stretch - a randomized stretching workout
     */
    public Wellness generateWellness(int workoutNum){
        int time = (int)((Math.random()*31) + 30);
        int numStretch = (int)((Math.random() * 5) + 8);
        Wellness stretch = new Wellness("Stretching", workoutNum, time, numStretch);
        return stretch;
    }

    /**
     * simulates the week of workouts, calculating calories, skipped workouts, and minutes of exerscise
     */
    public void workoutNextWeek(){
        for(int col = 0; col < workouts[0].length; col++){
            //skipped is a random variable between 1 and ten
            int skipped = (int)(Math.random() * 10) + 1;
            //if skipped is less then or equal to 2 then workout is skipped
            if(skipped <=2){
                numWorkoutSkipped++;
                System.out.println("Workout #" + workouts[curWeek][col].getWorkoutNum() + " Was skipped");
            }
            else{
                numWorkoutComplete++;
                totalCalories += workouts[curWeek][col].startExerscise();
                totalMin += workouts[curWeek][col].getDuration();


            }
        }
        curWeek++;
    }

    /**
     * prints and formats the progress
     */
    public void printProgress(){
        System.out.println();
        System.out.println("*** CURRENT PROGRESS ***");
        System.out.println("Number of workouts completed:\t" + numWorkoutComplete);
        System.out.println("Number of workouts skipped:\t\t" + numWorkoutSkipped);
        System.out.println("Total minutes of exerscise:\t\t" + totalMin);
        System.out.println("Total calories burned\t\t\t" + totalCalories);
        System.out.println();
    }

    /**
     * checks if the program has finished and reached the last week
     */
    public void endWorkout(){
        //if the current week equals the amount of rows in workouts
        if(curWeek == workouts.length-1){
            System.out.println("Congratulations you finished the workout plan");
            printProgress();
            System.out.println("Thank you for your committment");
            System.exit(20);
        }
    }


}
