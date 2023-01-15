package singlenumber;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 3, 4};
        System.out.println(singleNumber(numbers));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}