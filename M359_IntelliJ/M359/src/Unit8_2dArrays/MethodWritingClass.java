package Unit8_2dArrays;

public class MethodWritingClass {
    public static void main(String[] args) {
        int[][] myNums = {{9,7,23,5}, {29,8,22,20}, {15,19,21,7}};

        showArray(myNums);

        double avg = getAvg(myNums);
        System.out.println(avg);

        int count = getEvenRows(myNums);
        System.out.println(count);
        System.out.println(getEvenColumns(myNums));
    }

    public static void showArray(int[][] num){
        for(int[] x: num){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static double getAvg(int[][] num){
        int amount = 0;
        int sum = 0;
        for(int[] x: num){
            for(int y: x){
                sum+= y;
                amount++;
            }
        }

        return (double)sum/amount;
    }

    public static int getEvenRows(int[][] num){
        int even = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[0].length;j++){
                if(num[i][j]%2 == 0){
                    even++;
                    break;
                }
            }
        }
        return even;
    }

    public static int getEvenColumns(int[][] num){
        int even = 0;
        for(int i = 0; i < num[0].length; i++){
            for(int j = 0; j < num.length;j++){
                if(num[j][i]%2 == 0){
                    even++;
                    break;
                }
            }
        }
        return even;
    }
}
