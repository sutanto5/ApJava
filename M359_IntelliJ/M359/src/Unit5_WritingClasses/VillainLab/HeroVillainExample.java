package Unit5_WritingClasses.VillainLab;

import java.sql.SQLOutput;

public class HeroVillainExample {


    public static void main(String[] args) {
        //create power
        Power speed = new Power("SuperSpeed", 10);

        System.out.println("Hero Count: " + SuperHero.getNumHeroes());
        System.out.println("Villain Count: " + Villain.getNumVillains());

        //Define characters
        SuperHero flash = new SuperHero("Flash",speed);
        SuperHero flash2 = new SuperHero("Flash",speed);
        Villain mephisto = new Villain("Mephisto", speed);

        //print out amount of heroes/villains and strength cummatively
        System.out.println("Total Hero Strength: " + SuperHero.getTotalStrength());
        System.out.println("Total Hero Strength: " + Villain.getTotalStrength());
        System.out.println("Hero Count: " + SuperHero.getNumHeroes());
        System.out.println("Villain Count: " + Villain.getNumVillains());

        //sets mephisto's speed to 15
        mephisto.getSuperPower().setStrength(15);

        //prints character values
        System.out.println(flash);
        System.out.println();
        System.out.println(mephisto);
        System.out.println("Super power average strength: " + SuperHero.averageStrength());

        System.out.println();
        battle(flash, mephisto);
        System.out.println(flash);
        System.out.println();
        System.out.println(mephisto);
    }

    /**
     * Simulates a battle between the hero and the villain. Whoever has the greater strength will win.
     * At the end of the battle:
     *      *winner gains 10% of the strength of the loser
     *      * loser will lose between 5-35% (inclusive) of its OWN strength
     *      * in case of a tie, BOTH objects will lose between 5-35%(inclusive of their own strength
     * Print the result of the battle
     *
     * @param hero THis is the Superhero object
     * @param villain This is the Villain object
     */
    public static void battle(SuperHero hero, Villain villain){
        //if hero wins
        if(hero.getSuperPower().getStrength() > villain.getSuperPower().getStrength()){
            double increase = villain.getSuperPower().getStrength() * .1;
            hero.getSuperPower().setStrength(hero.getSuperPower().getStrength() + increase);

            double random = (Math.random() * .31) +.65;
            double current = hero.getSuperPower().getStrength() * random;
            villain.getSuperPower().setStrength(current);

            System.out.println("Yay! The hero has won!");
        }
        //if villain wins
        else if(hero.getSuperPower().getStrength() < villain.getSuperPower().getStrength()){
            double increase = hero.getSuperPower().getStrength() * .1;
            villain.getSuperPower().setStrength(villain.getSuperPower().getStrength() + increase);

            double random = (Math.random() * .31) + .65;
            double current = hero.getSuperPower().getStrength() * random;
            hero.getSuperPower().setStrength(current);

            System.out.println("No! The VILLAINS are taking over");
        }
        //if no on wins
        else {
            double random = (Math.random() * .31) + .65;
            double random2 = (Math.random() * .31) + .65;
            double currentHero = hero.getSuperPower().getStrength() * random;
            double currentVillain = villain.getSuperPower().getStrength() * random2;
            hero.getSuperPower().setStrength(currentHero);
            villain.getSuperPower().setStrength(currentVillain);
            System.out.println("Tie!");

        }
    }

}
