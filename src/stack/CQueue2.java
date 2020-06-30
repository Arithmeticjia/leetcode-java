package stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下
 * 请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )
 * stack1用来push
 * stack2用来pop
 */

import java.util.Deque;
import java.util.LinkedList;

public class CQueue2 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue2(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        // 一开始如果是空的，把stack1里面的倒入stack2
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // 倒完发现还是空
        if(stack2.isEmpty()){
            return -1;
        }else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
