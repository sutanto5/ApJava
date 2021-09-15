package Unit3_BooleansIfStatements.homework;

public class PizzaTester {

    public static void main(String[] args) {

        //instantiate a pizza object
        Pizza pineapple = new Pizza("Dominos", 3, 4, false);
        Pizza chez = new Pizza("Dominos", 7, false );

        //have it print out its  info
        pineapple.printInfo();
        chez.printInfo();

        //print out info by manually getting the string
        String pizza1 = pineapple.toString();
        System.out.println(pizza1);

        //print out p2's info by having Java call.toString automatically
        System.out.println(chez);

        if(pineapple.equals(chez)){
            System.out.println("\nboth pizza are the same stupid change");
        }
        else {
            System.out.println("\nthey are not the same");
        }

        int x =5, y =12;
        if(x >y)
            x++;
        else
            y-=3;
        x+=5;

        System.out.println(x + " " + y);
    }


}
