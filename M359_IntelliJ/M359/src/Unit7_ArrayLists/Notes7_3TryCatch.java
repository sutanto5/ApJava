package Unit7_ArrayLists;
import java.util.Scanner;

public class Notes7_3TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] myNums = {1,2,3,4};

        try{
            int x = 5/0;
            System.out.println(myNums[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(ArithmeticException e){
            System.out.println("Boohoo");
        }
        catch (Exception e){
            System.out.println("Something went wrong and caused an exception");
        }
    }
}
