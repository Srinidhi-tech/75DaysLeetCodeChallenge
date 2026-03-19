class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        // We use StringBuilder for better performance when modifying strings
        StringBuilder cleaned = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        // Step 2: Check if it's the same forward and backward
        String finalStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();
        
        return finalStr.equals(reversedStr);
    }
}