public class Solution{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5};
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
