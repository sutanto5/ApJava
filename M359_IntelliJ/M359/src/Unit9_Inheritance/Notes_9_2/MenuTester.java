package Unit9_Inheritance.Notes_9_2;

public class MenuTester {
    public static void main(String[] args) {
        MenuItem m = new MenuItem("Basic pizza");
        System.out.println();
        Entree e = new Entree("Rib platter", 3);
        System.out.println();
        Drink d = new Drink("Pepsi Zero", 24);
        System.out.println();
        Drink d2 = new Drink("Milkshake", 16, true);

        System.out.println(m);
        System.out.println();
        System.out.println(e);
        System.out.println();
        System.out.println(d);
    }
}
