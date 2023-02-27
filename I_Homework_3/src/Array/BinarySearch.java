package Array;

import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {

        Random rnd = new Random();

        int rnum = rnd.nextInt(100);
        int[] myArr = new int[rnum + 75];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i+1;
            System.out.print(myArr[i] + (i == myArr.length-1 ? "": " "));
        }
        System.out.println();

        //while(true) {
        int num = rnum + rnd.nextInt(100);
        System.out.println("num = " + num);
        int index = binarySearch(myArr, num);
        if (index != -1) {
            System.out.println("Binary search is finished on iteration " + index);
        } else {
            System.out.println("Number " + num + " not found in ArrayLength " + myArr.length);
            //break;
        }
        //}

    }

    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int iter = 0;
        while(firstIndex <= lastIndex) {
            iter++;
            int middleIndex = (firstIndex + lastIndex) / 2;

            System.out.print("[iter #" + iter + "] ");
            for(int i = firstIndex; i <= lastIndex; i ++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (arr[middleIndex] == elementToSearch) {
                return iter;
            }
            else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
