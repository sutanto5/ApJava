package Unit4_Iterations.examples;

    public class Notes4_3 {

        public static void main(String[] args) {

            // PART I
            String mySchool = "Vikings";

            // print every other character of mySchool on the same line
            for (int i = 0; i < mySchool.length(); i += 2) {
                System.out.print(mySchool.substring(i, i + 1) + " ");
            }
            System.out.println();

                // print the String mySchool in reverse (all characters on the same line)
            for(int i = mySchool.length()-1; i>=0; i--){
                System.out.print(mySchool.substring(i,i+1));
            }
            System.out.println();



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
            String animal = "tyrannosaurus rex";
            for(int i = 0; i <= animal.length(); i++){
                System.out.println(animal.substring(0,i));
            }
            System.out.println();

                // PART III
            String phrase = "Mary had a little lamb, little lamb, little lamb";
            phrase += "Mary had a little lamb, its fleece was white as snow";

                // Print the amount of times the word "little" appears within phrase?
            int amount = 0;
            while(phrase.indexOf("little") != -1){
                int appearance = phrase.indexOf("little");
                phrase = phrase.substring(appearance+6);
                amount++;
            }
            System.out.println(amount);

                // create a new String, or modify the existing String, that removes
                // the word "little" entirely
            String phrase2 = "Mary had a little lamb, little lamb, little lamb";
            phrase2 += " Mary had a little lamb, its fleece was white as snow";
            while(phrase2.indexOf("little") != -1){
                int appearance = phrase2.indexOf("little");
                phrase2 = phrase2.substring(0, appearance) + phrase2.substring(appearance+6);
            }
            System.out.println(phrase2);
            System.out.println();

                // create a new String (based on phrase), or modify the existing String,
                // that replaces the word "little" with the word "BIG"
            String phrase3 = "Mary had a little lamb, little lamb, little lamb";
            phrase3 += " Mary had a little lamb, its fleece was white as snow";
            String big = "";

            while(phrase3.indexOf("little") != -1) {
                int appearance = phrase3.indexOf("little");
                big += phrase3.substring(0, appearance) + "BIG";
                phrase3 = phrase3.substring(appearance+6);
            }
            big += phrase3;
            System.out.println(big);
        }
    }