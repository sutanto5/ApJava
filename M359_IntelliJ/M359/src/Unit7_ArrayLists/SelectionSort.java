package Unit7_ArrayLists;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(2);
        for(int i = 0; i < 20; i++){
            int rand = (int)(Math.random() *100000) + 20;
            nums.add(rand);
        }
        selectionSort(nums);
    }
    public static void selectionSort(ArrayList<Integer> list){
        System.out.println(list);

        for(int i = 0; i < list.size()-1; i++){

            int minInd = i;

            for(int j = i+1; j<list.size(); j++){
                if(list.get(j) < list.get(minInd)){
                    minInd = j;
                }
            }

            Integer temp = list.get(i);
            list.set(i, list.get(minInd));
            list.set(minInd, temp);

            System.out.println(list);
        }
    }
}
