package Unit9_Inheritance.Notes_9_2;

public class MenuItem {
    private String name;

    //Overloading = same name different parameters
    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }
    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }

    @Override
    public String toString(){
        return "Menu item: " + name;
    }

    public String getName(){
        return name;
    }


}
