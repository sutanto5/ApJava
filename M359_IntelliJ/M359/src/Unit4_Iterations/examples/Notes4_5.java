package Unit4_Iterations.examples;

public class Notes4_5 {

    public static void outputBreak(String title){
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }

    public static void everyOtherLetterPyramid(String str){
            System.out.println(str);
            while(str.length() > 1){
                String newString = str;
                String blank = "";
                for (int i = 0; i < newString.length(); i += 2) {
                    System.out.print(newString.substring(i, i + 1));
                    blank += newString.substring(i,i+1);
                }

                str = blank;
                System.out.println();
            }
    }

    public static void main(String[] args) {

        //Prints out numbers in ascending order from 1-5
        //Decreases every new output line
        outputBreak("Challenge 1: Number Pyramid 1-5");
        for (int num = 5; num > 0; num--) {
            for(int j = 1; j<=num; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //prints out 5-1 in descending order in correspondence
        //with the amount depicted in the number
        outputBreak("Challenge 2: Number Pyramid 5-1");
        for (int i = 5; i > 0; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        outputBreak("Challlenge 3: Every Other Letter Pyramid");
        String name = "JoshuaSutanto";
        everyOtherLetterPyramid(name);

        outputBreak("Every other word Backwards");
    }

}
