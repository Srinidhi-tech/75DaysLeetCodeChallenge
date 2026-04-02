import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        // Stack stores indices of the temperatures array
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Check if current temp is warmer than the temp at the index on top of stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            // Push current index onto the stack
            stack.push(i);
        }

        return answer;
    }
}