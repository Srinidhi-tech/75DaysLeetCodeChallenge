class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // The problem asks for 1-based indexing
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                // Sum is too small, move left pointer to a larger value
                left++;
            } else {
                // Sum is too large, move right pointer to a smaller value
                right--;
            }
        }
        
        // Per problem constraints, a solution always exists.
        return new int[] {-1, -1};
    }
}