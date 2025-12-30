public class CapacityToShipPackagesWithinDDays {

    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Find search range
        for (int w : weights) {
            low = Math.max(low, w);  // max weight
            high += w;               // sum of weights
        }

        // Binary Search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid;       // try smaller capacity
            } else {
                low = mid + 1;    // need larger capacity
            }
        }

        return low;
    }

    // Greedy check
    private static boolean canShip(int[] weights, int days, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return dayCount <= days;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum capacity required: " + result);
    }
}
