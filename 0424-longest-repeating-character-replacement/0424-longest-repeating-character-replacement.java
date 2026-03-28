class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Update the frequency of the current character
            count[s.charAt(right) - 'A']++;
            
            // Keep track of the most frequent character in the current window
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // If (window size - max frequency) > k, we must shrink the window
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}