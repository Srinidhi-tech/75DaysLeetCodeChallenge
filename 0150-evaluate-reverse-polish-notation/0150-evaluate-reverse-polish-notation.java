import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (isOperator(s)) {
                // The order of popping matters: 
                // The first pop is the second operand (right side of the operator)
                int b = stack.pop();
                int a = stack.pop();
                
                switch (s) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        // Java integer division naturally truncates toward zero
                        stack.push(a / b);
                        break;
                }
            } else {
                // If it's not an operator, it's a number
                stack.push(Integer.parseInt(s));
            }
        }

        // The final remaining value is the result of the entire expression
        return stack.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}