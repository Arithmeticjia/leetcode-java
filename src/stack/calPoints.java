package stack;

import java.util.Stack;

public class calPoints {

    public int calPoints(String[] ops) {
        // 栈
        Stack<Integer> stack = new Stack<>();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
                // 把栈pop
            } else if (op.equals("C")) {
                stack.pop();
                // peek返回但不pop
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) {
            ans += score;
        }
        return ans;
    }
}
