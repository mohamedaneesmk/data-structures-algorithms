public class AllocateMinimumPages {

    public static void main(String[] args) {

        System.out.println(allocateBooks(new int[]{12, 34, 67, 90}, 2)); // 113
        System.out.println(allocateBooks(new int[]{15, 17, 20}, 5));     // -1
        System.out.println(allocateBooks(new int[]{22, 23, 67}, 1));     // 112
    }

    public static int allocateBooks(int[] arr, int k) {

        if (k > arr.length) return -1; // edge case

        int low = 0, high = 0;

        for (int pages : arr) {
            low = Math.max(low, pages); // minimum limit
            high += pages;              // maximum limit
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1; // try minimizing max pages
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int students, int maxPages) {

        int count = 1;
        int sum = 0;

        for (int pages : arr) {
            if (sum + pages > maxPages) {
                count++;
                sum = pages;

                if (count > students) return false;
            } else {
                sum += pages;
            }
        }
        return true;
    }
}
