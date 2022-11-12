package Day02.Mentoring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
// Leetcode 912

    public static void main(String[] args) {
        int[] unsortedArr = {3,6,-3,6000};
        int[] sortedArr = new int[unsortedArr.length];

        for (int i = 0; i < unsortedArr.length; i++) {
           if (unsortedArr[i] <= unsortedArr[i+1]){
               sortedArr[i] = unsortedArr[i];
               sortedArr[i+1] = unsortedArr[i+1];
               i++;
           } else {
               sortedArr[i] = unsortedArr[i+1];
               sortedArr[i+1] = unsortedArr[i];
           }
        }
        System.out.println(Arrays.toString(sortedArr));

    }

}
