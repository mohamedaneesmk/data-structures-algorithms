public class EatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int H = 8;
        int result = minEatingSpeed(piles, H);
        System.out.println("Minimum eating speed: " + result);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    private static boolean canFinish(int[] piles, int h, int mid) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + mid - 1) / mid; // Ceiling division
        }
        return hoursNeeded <= h;
    }
}
