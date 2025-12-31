public class SwitchDSAExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int choice = 3; // 1-sum, 2-max, 3-search
        int target = 4;

        switch (choice) {
            case 1:
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum of array = " + sum);
                break;

            case 2:
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                System.out.println("Max element = " + max);
                break;

            case 3:
                int index = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == target) {
                        index = i;
                        break;
                    }
                }
                System.out.println("Element found at index = " + index);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
