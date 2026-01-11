public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        int result = checkHeight(heights);

        System.out.println(result);
    }

    private static int checkHeight(int[] heights) {
        // Count frequency of each height (1 to 100)
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }

        int mismatches = 0;
        int currentHeight = 1;

        for (int i = 0; i < heights.length; i++) {
            // Find next expected height
            while (count[currentHeight] == 0) {
                currentHeight++;
            }

            // Compare with actual height
            if (heights[i] != currentHeight) {
                mismatches++;
            }

            // Consume one occurrence of current height
            count[currentHeight]--;

        }
        return mismatches;
    }
}
