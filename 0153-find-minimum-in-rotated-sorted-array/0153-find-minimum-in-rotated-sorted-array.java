class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // The minimum is in the right half, and mid is not the minimum
                low = mid + 1;
            } else {
                // The minimum is in the left half, and mid could be the minimum
                high = mid;
            }
        }

        // When low == high, we've found the smallest element
        return nums[low];
    }
}