package Unit2_UsingObjects.examples;

public class WrapperClassExample {
    public static void main(String[] args){
        int x = 5;
        System.out.println(x);

        //wrapper class in action
        //create a wrapped int(wrapped int)
        Integer wrappedInt = new Integer(7);

        //extract the int value inside of wrappedInt
        int insideValue = wrappedInt.intValue();

        //print the int value
        System.out.println(insideValue);

        //there's a betterr way! java actually autoboxes and unboxes for us!
        Integer newWrappedInt  = 8; //Exactly the same as writing
                //Integer newWrapped Int = new Integer(8);

        System.out.println(newWrappedInt);
        //Exactly like: System.out.println(newWrappedInt.intValue());

        //1. do the create a double variable using autoboxing,
        //then print it using auto-unboxing
        Double wrappedDouble = 2.8;

        //Double wrappedDouble = new Double(8.23724);
        System.out.println(wrappedDouble);

        //2. Print the min/max Integer values
        System.out.println("MAXIMUM: " + Integer.MAX_VALUE + "\nMININIMUM: " + Integer.MIN_VALUE);
    }

}
