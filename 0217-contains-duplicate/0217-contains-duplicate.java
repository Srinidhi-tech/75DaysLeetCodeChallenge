

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the numbers we've seen
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // .add() returns false if the element was already present
            if (!seen.add(num)) {
                return true;
            }
        }
        
        // If we get through the whole array, no duplicates were found
        return false;
    }
}
    
