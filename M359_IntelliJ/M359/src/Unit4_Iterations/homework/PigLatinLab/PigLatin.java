package Unit4_Iterations.homework.PigLatinLab;

import java.util.Locale;

public class PigLatin {
    /*public static String toPigLatin(String sentence){
        sentence = sentence.toLowerCase(Locale.ROOT);
        String pigLatin = "";
        for(int i = 0; i< sentence.length(); i++){
            if(sentence.indexOf(' ') == i){
                String word = sentence.substring(0,i);
                translateWordToPigLatin(word);
            }
        }
        return sentence;
   */

    public static String translateWordToPigLatin(String word){
        String letter = word.substring(0,1);
        if(letter.equalsIgnoreCase("a")|| letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||letter.equalsIgnoreCase("u")) {
            return word += "yay";
        }else{
            String beforeVowel = "";
            while (word.charAt(0) != 'a'|| word.charAt(0) != 'e' || word.charAt(0) != 'i' || word.charAt(0) != 'o' || word.charAt(0) != 'u'){
                beforeVowel += word.substring(0,1);
                word = word.substring(1);
            }
            return word + beforeVowel + "ay";
        }
    }

    public static String toPigLatin(String sentence) {
        String pigLatin ="";
        for(int i = 0; i < sentence.length(); i++ ){
            String space = sentence.substring(i,i+1);
            if(space.equals(" ")){
                String word = sentence.substring(0,i);
                pigLatin += translateWordToPigLatin(word);
                sentence = sentence.substring(i);
            }
        }
        return pigLatin;
    }
}
