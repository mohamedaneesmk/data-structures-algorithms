import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {

        // 🔹 Input included in code
        // int n = 5;
        int c = 3;
        int[] stalls = {1, 2, 4, 8, 9};

        int result = maxMinDistance(stalls, c);
        System.out.println("Largest minimum distance = " + result);
    }

    public static int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int low = 0;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(stalls, cows, mid)) {
                ans = mid;      // valid
                low = mid + 1;  // try larger distance
            } else {
                high = mid - 1; // try smaller distance
            }
        }
        return ans;
    }

    private static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1;          // place first cow
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }
}
