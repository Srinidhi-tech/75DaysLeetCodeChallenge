public class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // 'i' is the slow pointer tracking the position of unique elements
        int i = 0;

        // 'j' is the fast pointer scouting for new values
        for (int j = 1; j < nums.length; j++) {
            // If we find a value different from the last unique element
            if (nums[j] != nums[i]) {
                i++;           // Move to the next available slot
                nums[i] = nums[j]; // Update the slot with the new unique value
            }
        }

        // Since i is an index, the count of unique elements is i + 1
        return i + 1;
    }
}