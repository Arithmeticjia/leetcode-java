package stack;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void appendTail(int value){
        // 把stack1清空，倒入stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        size++;
    }

    public int deleteHead() {
        if(size == 0){
            return -1;
        }
        size--;
        // 从stack1中pop出去
        return stack1.pop();
    }

}
