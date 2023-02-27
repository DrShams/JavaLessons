package Array;

import java.util.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {999,1,2,3,4,5,6,7,8,9,10,10,10,10,10,-999};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
