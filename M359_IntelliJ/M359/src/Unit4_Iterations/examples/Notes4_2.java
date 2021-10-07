package Unit4_Iterations.examples;
import java.util.Scanner;
public class Notes4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Print the even numbers from 0 to 20 on the same line
        for(int i = 0; i<=20; i+=2){
            System.out.print(i + " \t");
        }
        System.out.println();

        //2. Print the multiples of 5 from 5 to 100 on the same line
        for(int i = 5; i<=100; i+=5){
            System.out.print(i + " \t");
        }
        System.out.println();


        System.out.println("Give me a word:");
        String str = input.nextLine();
        //3. Print every character of String str with a space in between the letters
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        //4. Printe every character of String str in reverse order
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
