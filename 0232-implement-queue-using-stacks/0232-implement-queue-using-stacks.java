import java.util.Stack;

class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    /** Pushes element x to the back of the queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from the front of the queue and returns it. */
    public int pop() {
        peek(); // Ensure the output stack is populated
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        // Only move elements if the output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}