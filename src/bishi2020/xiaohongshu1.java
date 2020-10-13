package bishi2020;

import java.util.Stack;

/**
 * 给定一个字符串列表，每个字符串可以是以下五种类型之一：
 * 1. 整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效回合得分的总和。
 * 3. "T"（一轮的得分）：表示本轮获得的得分是前一轮有效回合得分的三倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效回合的分数是无效的，应该被移除。
 * 5. "-" （一轮的得分）：表示本轮获得的得分是前两轮有效回合得分的差的绝对值。
 * 每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
 * 你需要返回你在所有回合中得分的总和。
 */
public class xiaohongshu1 {

    public static void main(String[] args) {
        String[] strs = new String[]{"5", "2", "C", "T","+","-"};
        System.out.print(new xiaohongshu1().calPoints(strs));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String op: ops){
            if (op.equals("+")){
                int top = stack.pop();
                int n_top = stack.peek() + top;
                stack.push(top);
                stack.push(n_top);
            }else if(op.equals("T")){
                stack.push(stack.peek()*3);
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("-")){
                int top = stack.pop();
                int n_top = Math.abs(stack.peek() - top);
                stack.push(top);
                stack.push(n_top);
            }else{
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int s:stack){
            ans += s;
        }

        return ans;
    }
}
