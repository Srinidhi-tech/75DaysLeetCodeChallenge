class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first 'k' elements
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        double maxSum = currentSum;
        
        // Step 2: Slide the window from index 'k' to the end of the array
        for (int i = k; i < nums.length; i++) {
            // Add the next element and remove the first element of the previous window
            currentSum += nums[i] - nums[i - k];
            // Update maxSum if the new window's sum is larger
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Step 3: Return the average
        return maxSum / k;
    }
}