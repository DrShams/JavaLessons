package Array;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {995, 990, 999, 777, 888};

        boolean isSorted = false;
        int temp;//задачу можно решить через Collections.swap() без замены через временную переменную
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
