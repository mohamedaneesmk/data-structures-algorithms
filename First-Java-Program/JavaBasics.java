public class JavaBasics {

    // MAIN METHOD – program starts here
    public static void main(String[] args) {

        // 1️⃣ Printing output
        System.out.println("Hello, Java + DSA!");

        // 2️⃣ Variables & Data Types
        int a = 10;
        int b = 20;

        // 3️⃣ Arithmetic Operation
        int sum = a + b;
        System.out.println("Sum = " + sum);

        // 4️⃣ Conditional Statements
        if (sum > 20) {
            System.out.println("Sum is greater than 20");
        } else {
            System.out.println("Sum is less than or equal to 20");
        }

        // 5️⃣ Loop (for)
        System.out.print("Numbers from 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 6️⃣ Array (core DSA concept)
        int[] arr = {1, 2, 3, 4, 5};

        // 7️⃣ Traversing Array
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 8️⃣ Method Call
        int result = add(5, 7);
        System.out.println("Addition using method: " + result);

        // 9️⃣ Simple Search (DSA base)
        int target = 3;
        int index = linearSearch(arr, target);
        System.out.println("Element found at index: " + index);
    }

    // METHOD
    static int add(int x, int y) {
        return x + y;
    }

    // LINEAR SEARCH (FIRST DSA ALGO)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
