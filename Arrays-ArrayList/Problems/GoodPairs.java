package Problems;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };

        int result = findGoodPairs(nums);
        System.out.println(result);
    }

    private static int findGoodPairs(int[] nums) {
        int goodPairsCount = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num:nums){
            if(countMap.containsKey(num)){
                goodPairsCount += countMap.get(num);
                countMap.put(num, countMap.get(num)+1);
            }
            else{
                countMap.put(num, 1);
            }
        }

        return goodPairsCount;
    }
}
