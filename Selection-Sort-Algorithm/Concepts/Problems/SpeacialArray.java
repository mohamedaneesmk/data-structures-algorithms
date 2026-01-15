public class SpeacialArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1 };
        System.out.println(canMakeSpecialArray(arr));
    }

    private static int canMakeSpecialArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        // Step 1: count frequencies
        for (int num : nums) {
            if (num >= n) {
                freq[n]++; // cap at n
            } else {
                freq[num]++;
            }
        }

        // Step 2: suffix sum to know how many numbers >= x
        int count = 0;
        for (int x = n; x >= 0; x--) {
            count += freq[x];
            if (count == x) {
                return x;
            }
        }

        return -1;
    }
}
