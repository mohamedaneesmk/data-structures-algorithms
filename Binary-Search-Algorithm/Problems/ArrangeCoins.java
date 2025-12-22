public class ArrangeCoins {
    public static void main(String[] args) {
        int num = 5;
        int result = arrangeCoins(num);

        System.out.println(result);
    }

    private static int arrangeCoins(int num) {
        long low = 0;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == num)
                return (int) mid;
            else if (coins < num)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (int) high;
    }
}
