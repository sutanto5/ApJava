package Unit2_UsingObjects.examples;

public class StringExample {
    public static void main(String[] args){
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        //.toUpperCase returns the same string but all caps
        System.out.println(s1.toUpperCase());

        //prints out the original string
        System.out.println(s1);

        //indexOf returns 1 if the specified char/string is found and -1 if the char/string is not fount
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));

        //When substring is called with one parameter the println prints at the specified number
        //to the end of the word
        System.out.println(s1.substring(4));

        //When with two parameters substring prints out the letters starting from the first parameter and to
        //the second para
        // meter
        System.out.println(s1.substring(2, 5));

        //.length returns the number of characters in a string
        System.out.println(s1.length());
        System.out.println(s2.length());

        //.equals returns trure if the string matches the specified paramater
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);
        //Since Vacation equals Vacation then the system will print true
        isEqual = s1.equals("Vacation");
        System.out.println(isEqual);
        //Since Vacation is printed in uppercase then
        isEqual = s1.toUpperCase().equals("VACATION");
        System.out.println(isEqual);

        //.compareTo bases it on alpabetical order
        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        //If the first string when compared to the second one is less similar, in terms of
        //characters then the computer will output a negative number
        System.out.println(s3.compareTo(s4));

        //If the first string when compared to the second one is equal to, in terms of
        //characters then the computer will output a 0
        System.out.println(s3.compareTo(s3));

        //If the first string when compared to the second one is more similar, in terms of
        //characters then the computer will output a positive number
        System.out.println(s4.compareTo(s3));

        //since alphabetically in the ascii table capitals come before lower case the bat would be more than bird
        //If the first string when compared to the second one is less similar, in terms of
        //characters then the computer will output a negative number
        System.out.println(s5.compareTo(s3));

        //prints out the numbers and letters separately without combining any
        System.out.println("I love " + "M" + "3" + "5" + "9");

        //Since there is a parantheses around the number the integers will be combined
        System.out.println("I love " + "M" + (3 + 5 + 9));

        //If the integers are in front of the string it will combine them first
        System.out.println(24 + 56 + " Days of School");
        //prints out numbers combined since there is no parentheses
        System.out.println("Days of School: " + 24 + 56);
    }
}
