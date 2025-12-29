public class ReachNumber {
    public static void main(String[] args) {
        int target = 5; // Example target
        int result = reachNumber(target);
        System.out.println("Minimum steps to reach " + target + ": " + result);
    }

    private static int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            step++;
            sum += step;
        }

        return step;
    }
}
