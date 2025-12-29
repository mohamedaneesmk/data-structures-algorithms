public class FindPeakElementII {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4 }, { 3, 2 } };
        int[][] peak = findPeakGrid(matrix);

        for (int[] pos : peak) {
            System.out.println("Peak found at: [" + pos[0] + ", " + pos[1] + "]");
        }
    }

    private static int[][] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            // Find row index of maximum element in mid column
            int maxRow = 0;
            for (int r = 0; r < rows; r++) {
                if (mat[r][midCol] > mat[maxRow][midCol]) {
                    maxRow = r;
                }
            }

            int midVal = mat[maxRow][midCol];
            int leftVal = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int rightVal = (midCol + 1 < cols) ? mat[maxRow][midCol + 1] : -1;

            // Check if it is a peak
            if (midVal > leftVal && midVal > rightVal) {
                return new int[][] { { maxRow, midCol } };
            }
            // Move to the side with a larger neighbor
            else if (leftVal > midVal) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        // Guaranteed to have a peak
        return new int[][] { { -1, -1 } };
    }
}
