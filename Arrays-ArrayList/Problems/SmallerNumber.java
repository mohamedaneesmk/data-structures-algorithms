package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = findSmallerNumber(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] findSmallerNumber(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
