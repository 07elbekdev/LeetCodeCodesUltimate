package sortAnArray;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[]array = {3,4,1,5,2};
        System.out.println(Arrays.toString(sortArray(array)));
    }
        public static int[] sortArray(int[] nums) {
           return Arrays.stream(nums).sorted().toArray();
        }
    }