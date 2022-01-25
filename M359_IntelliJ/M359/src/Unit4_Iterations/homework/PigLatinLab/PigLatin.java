package Unit4_Iterations.homework.PigLatinLab;

import java.util.Locale;

public class PigLatin {

    //Translates the given word to pig latin
    /* Pig latin Rules:
            if the word begins with a vowel add yay to the end of the word
            if the word begins with a consonant move that consonant to the back till the first vowel
            then add ay to the end of the word
     */
    public static String translateWordToPigLatin(String word){
        String letter = word.substring(0,1);
        //if the first letter is a vowel add yay
        if(checkVowel(letter)){
            return word += "yay";
        //if the first letter is a consonant substring it until it has a vowel
        }else{
            String beforeVowel = "";
            while (checkVowel(word.substring(0,1)) != true){
                beforeVowel += word.substring(0,1);
                word = word.substring(1);
            }
            return word + beforeVowel + "ay";
        }
    }


    //A helper function to translateWordToPigLatin
    //returns true if the letter given is a vowel
    //returns false if it is a consonant
    public static boolean checkVowel(String letter) {
        //checks for vowels
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
            return true;
        } else {
            return false;
        }
    }

    //Makes the first letter in the given sentence capatalized then returns the sentence
    public static String properGrammar(String sentence){
        //lowercases every letter except the first letter
        String notFirstLetter = sentence.substring(1).toLowerCase(Locale.ROOT);
        //capatalizes the first letter
        sentence = sentence.substring(0,1).toUpperCase(Locale.ROOT);
        sentence += notFirstLetter;
        return sentence;
    }

    //converts the given sentence to proper pig latin
    public static String toPigLatin(String sentence) {
        String pigLatin = "";

        //while there are still spaces in the sentence
        while(sentence.indexOf(' ') > 0) {
            int space = sentence.indexOf(' ');
            //saves first word into word
            String word = sentence.substring(0, space);
            //substrings the first word out of the sentence
            sentence = sentence.substring(space + 1);
            //translates the word to piglatin and puts it into pigLatin string
            pigLatin += translateWordToPigLatin(word) + " ";
        }
        //translates the last word to pigLatin
        pigLatin+= translateWordToPigLatin(sentence);
        //capatalizes the first letter
        pigLatin = properGrammar(pigLatin);
        return pigLatin;
    }


}