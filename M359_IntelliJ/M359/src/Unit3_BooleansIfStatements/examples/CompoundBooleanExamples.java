package Unit3_BooleansIfStatements.examples;

public class CompoundBooleanExamples {

    //1. Alice loves video games. She plays games if it's Saturday or if she doesn't have any homework.
    //Print out either "Yay video games!" or "I guess I'll have to wait."
    public static void main(String[] args) {

        String day = "Monday";
        int numHmwk = 2;

        if (day.equals("Saturday") || numHmwk == 0) {

            System.out.println("Yay video games!");

        } else {

            System.out.println("I guess I'll have to wait");

        }

        //2. Bob only goes to coding club if the day is monday and if the number of hw assignments he has is
        //less than or equal to 2
        //Print either yay coding club!" or "Today is a sad day!"
        if(day.equals("Monday") && numHmwk <= 2){

            System.out.println("Yay coding club!");

        }else {
            System.out.println("Today is a sad day!");
        }


        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("exerscise");
        }else{

            int probability = (int)(Math.random() * 10) +1;

            if(numHmwk ==0 && probability <= 8 || numHmwk>0 && probability<=3){
                System.out.println("exerscise");

            } else{
                System.out.println("no exerscise");
            }
        }


        //what will print?
        //&& come first in order of precedence
        if(true || false && false || true){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

}
