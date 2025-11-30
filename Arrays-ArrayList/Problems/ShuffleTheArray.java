package Problems;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = findShuffledArray(nums,n);
        for(int num : result){
            System.out.print(num+" ");
        }
    }

    private static int[] findShuffledArray(int[] nums, int n) {
        int[] result = new int[n * 2];

        for(int i = 0;i < n; i++){
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }
}
