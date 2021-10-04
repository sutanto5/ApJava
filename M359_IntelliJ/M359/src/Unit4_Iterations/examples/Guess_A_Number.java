package Unit4_Iterations.examples;
import java.util.Scanner;
public class Guess_A_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 10) + 1;
        int count = 0;
        boolean isDone = false;

        while(!isDone){
            //enter a guess
            System.out.println("Guess the number:");

            //input your guess
            int guess = input.nextInt();
            count++;

            //does your number == the randomized number
            if(number == guess){
                isDone = true;
            } else{
                if(guess < number){
                    System.out.println("Guess was too low\n");
                }else{
                    System.out.println("Guess was too high\n");
                }

            }
        }

        //stats
        System.out.println("Turn Amount: " + count);
        System.out.println("Number was " + number);
    }
}
