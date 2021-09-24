package Unit3_BooleansIfStatements.homework.PizzaTester;

public class PizzaTester {

    public static void main(String[] args) {

        //instantiate a pizza object
        Pizza pineapple = new Pizza("Dominos", 3, 4, false);
        Pizza chez = new Pizza("Dominos", 7, false );
        Pizza chez2 = new Pizza("Dominos", 7, false );

        //have it print out its  info
        pineapple.printInfo();
        chez.printInfo();

        //print out info by manually getting the string
        String pizza1 = pineapple.toString();
        System.out.println(pizza1);

        //print out p2's info by having Java call.toString automatically
        System.out.println("\n" + chez);

        if(pineapple.equals(chez)){
            System.out.println("\nboth pizza are the same stupid change");
        }
        else {
            System.out.println("\nthey are not the same \n");
        }

        //equals tester
        System.out.println(pineapple.equals(chez));     //false
        System.out.println(chez.equals(chez2) + "\n");  //true

        //compare to tester
        System.out.println(pineapple.compareTo(chez));  //-4
        System.out.println(chez.compareTo(chez2));      //0

        //if else loop practice
        int x =5, y =12;
        if(x >y)
            x++;
        else
            y-=3;
        x+=5;

        System.out.println("\n" + x + " " + y); //should output 10 9
    }


}
