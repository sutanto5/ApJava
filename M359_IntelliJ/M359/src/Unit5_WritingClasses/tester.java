package Unit5_WritingClasses;

public class tester {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,-5,0,12};
        int sum = 0;
        for(int s: numbers){
            sum+=s;
        }
        System.out.println(sum);

        for(int s: numbers){
            s = (int)(Math.random() * 8) + 5;
            System.out.println(s);
        }
        System.out.println(numbers[4]);

    }
}
