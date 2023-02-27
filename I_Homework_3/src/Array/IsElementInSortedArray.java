package Array;

import java.util.Arrays;

public class IsElementInSortedArray {

    public static void main(String[] args) {

        String[] vowels = { "A", "C", "E", "D", "B" };
        System.out.println(Arrays.toString(vowels));
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        String element = "Z";
        boolean ifexists = false;

        for (String s : vowels) {
            if ("W".equals(s)) {
                System.out.println(element + " found in the vowels list.");
                ifexists = true;
            }
        }
        if (ifexists == false) {
            System.out.println(element + " is not found in the vowels list.");
        }
    }
}
