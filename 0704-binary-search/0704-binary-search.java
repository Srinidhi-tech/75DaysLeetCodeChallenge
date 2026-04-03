class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;

        while (low <= high) {
            // Recalculate mid inside the loop every time the range changes
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // Found it!
            } 
            else if (nums[mid] < target) {
                // Target is in the right half, move the low pointer
                low = mid + 1;
            } 
            else {
                // Target is in the left half, move the high pointer
                high = mid - 1;
            }
        }
        
        return -1; // Target not in array
    }
}