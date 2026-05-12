class Solution {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        // Find meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // Move slow to start
        slow = 0;

        // Find duplicate number
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}