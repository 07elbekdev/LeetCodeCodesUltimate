package canMakeArithmaticProgression;

import java.util.Arrays;

public class CanMakeArithmaticProgression {
    public static void main(String[] args) {
        int[] array = {0, 0, 0};
        System.out.println(canMakeArithmeticProgression(array));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int equ = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) != equ) return false;
        }
        return true;
    }
}