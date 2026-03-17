import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. Keep a min-heap of size k
        // We compare based on the frequency (the map value)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2)
        );

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the smallest frequency
            }
        }

        // 3. Build the output array
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}