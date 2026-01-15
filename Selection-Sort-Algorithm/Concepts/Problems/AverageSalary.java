public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        double average = averageSalary(salary);
        System.out.println("Average Salary: " + average);
    }

    private static double averageSalary(int[] salary) {
        int n = salary.length;
        if (n <= 2) {
            return 0.0; // Not enough data to compute average after removing min and max
        }

        // Find min and max salary
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int sum = 0;

        for (int sal : salary) {
            sum += sal;
            if (sal < minSalary) {
                minSalary = sal;
            }
            if (sal > maxSalary) {
                maxSalary = sal;
            }
        }

        // Remove min and max from sum
        sum -= (minSalary + maxSalary);

        // Calculate average
        return (double) sum / (n - 2);
    }    
}
