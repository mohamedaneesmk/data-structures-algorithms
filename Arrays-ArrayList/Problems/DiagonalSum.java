package Problems;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int result = findDiagonalSum(matrix);
        System.out.println(result);
    }

    private static int findDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
            if(row != matrix.length - 1 - row)
                sum += matrix[row][matrix.length - 1- row];
        }

        return sum;
    }
}
