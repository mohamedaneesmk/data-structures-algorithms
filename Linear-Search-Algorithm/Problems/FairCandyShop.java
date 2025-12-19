import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandyShop {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 1 };
        int[] bobSizes = { 2, 2 };

        int[] result = findFairCandyShopCalculation(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findFairCandyShopCalculation(int[] aliceSizes, int[] bobSizes) {
        int sumOfAlices = 0;
        int sumOfBob = 0;

        for (int num : aliceSizes)
            sumOfAlices += num;
        for (int num : bobSizes)
            sumOfBob += num;

        int diff = (sumOfBob - sumOfAlices) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int num : bobSizes)
            bobSet.add(num);

        for (int num : aliceSizes) {
            if (bobSet.contains(num + diff)) {
                return new int[] { num, num + diff };
            }
        }

        return new int[] {};
    }
}
