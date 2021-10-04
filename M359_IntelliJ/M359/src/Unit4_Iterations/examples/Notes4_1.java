package Unit4_Iterations.examples;
import java.util.Scanner;
public class Notes4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String reply = "";
        int score = 0;
        int scoreAmount = 0;
        boolean isDone = false;

        while (!isDone){
            //prompt user if they have a new score to enter
            System.out.println("Do you have a new score to enter? (Y or N): ");
            reply = input.nextLine();

            //prompt user to enter a new score
            if(reply.equalsIgnoreCase("y")){
                System.out.println("How much did you score? ");
                int nextNum = input.nextInt();

                //update our stats
                score += nextNum;
                scoreAmount++;
                input.nextLine();

            } else{
                //done adding scores
                isDone = true;
            }

        }

        //Add score to total
        System.out.println("\nTotal sum of all scores: " + score);
        System.out.println("Total amount of all numbers: " + scoreAmount);
        System.out.println((double) score/scoreAmount + " is your average score \n");

    }

}
