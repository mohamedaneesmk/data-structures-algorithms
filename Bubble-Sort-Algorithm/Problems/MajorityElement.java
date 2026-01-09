public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }

    private static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
