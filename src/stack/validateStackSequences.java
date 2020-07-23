package stack;

import java.util.Stack;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 *
 * 初始化： 辅助栈 stackstack ，弹出序列的索引 ii ；
 * 遍历压栈序列： 各元素记为 numnum ；
 * 元素 numnum 入栈；
 * 循环出栈：若 stackstack 的栈顶元素 == 弹出序列元素 popped[i]popped[i] ，则执行出栈与 i++i++ ；
 * 返回值： 若 stackstack 为空，则此弹出序列合法。
 *
 */
public class validateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num: pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }

        return stack.isEmpty();
    }
}
